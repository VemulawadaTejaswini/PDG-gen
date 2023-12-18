    import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Comparator;
 
class Point{
    public static int nextId = 0;

    public int id;
    public int x;
    public int y;
    /** パチクリのタイプ（0?4）、もしくは-1（S、G） */
    public int type;
    public int distanceFromStart;
    public Set<Point> nextPointSet;

    public Point(int x, int y, int type) {
        this.id = nextId++;
        this.x = x;
        this.y = y;
        this.type = type;
        this.distanceFromStart = Integer.MAX_VALUE;
    }

    public int distance(Point p) {
        return Math.abs(this.x - p.x) + Math.abs(this.y - p.y);
    }
}

public class Main {
    public static BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));

    public static Point start = null;
    public static Point goal = null;

    //パチモンのタイプ毎の頂点リスト
    public static List<Set<Point> > pointSetListByType =
            new ArrayList<Set<Point> >();
    static {
        // 枠だけ用意
        for(int i = 0; i < 5; i++) {
            pointSetListByType.add(new HashSet<Point>());
        }
    }

    public static void main(String args[]) throws IOException {
        while(true) {
            String mapSizeStr = br.readLine();
            if("0 0".equals(mapSizeStr)) break;

            String[] splittedStr = mapSizeStr.split(" ");
            int x = Integer.parseInt(splittedStr[0]);
            int y = Integer.parseInt(splittedStr[1]);
             
            for(Set<Point> pointSet : pointSetListByType) {
                pointSet.clear();
            }
            Point.nextId = 0;
 
            for(int r = 0; r < y; r++){
                String line = br.readLine();
                for(int c = 0; c < x; c++) {
                    char pointLiteral = line.charAt(c);
                    if(pointLiteral == 'S') {
                        start = new Point(c, r, -1);
                        start.nextPointSet = new HashSet<Point>();
                        start.distanceFromStart = 0;
                    } else if(pointLiteral == 'G') {
                        goal = new Point(c, r, -1);
                        goal.nextPointSet = null;
                    } else if(pointLiteral != '.') {
                        int type = (int)pointLiteral - (int)'1';
                        pointSetListByType.get(type).add(new Point(c, r, type));   
                    }
                }
            }
             
            //到達不可能判定
            //1匹もパチモンがいない属性が2つ以上あれば、到達不能
            int zeroTypeCount = 0;
            for(Set<Point> pointSet : pointSetListByType) {
                if(pointSet.isEmpty()) {
                    if(++zeroTypeCount >= 2) {
                        break;
                    }
                }
            }
            if(zeroTypeCount >= 2) {
                System.out.println("NA");
                continue;
            }

            // 各属性間のつながりを生成
            Set<Point> firePointSet = pointSetListByType.get(0);
            Set<Point> icePointSet = pointSetListByType.get(1);
            Set<Point> treePointSet = pointSetListByType.get(2);
            Set<Point> earthPointSet = pointSetListByType.get(3);
            Set<Point> waterPointSet = pointSetListByType.get(4);
            //  fire to ice
            for (Point p : firePointSet) {
                p.nextPointSet = icePointSet;
            }
            //  ice to tree
            for (Point p : icePointSet) {
                p.nextPointSet = treePointSet;
            }
            //  tree to earth
            for (Point p : treePointSet) {
                p.nextPointSet = earthPointSet;
            }
            //  earth to water
            for (Point p : earthPointSet) {
                p.nextPointSet = waterPointSet;
            }
            //  water to fire
            for (Point p : waterPointSet) {
                p.nextPointSet = firePointSet;
            }
            
            boolean firePointIsEmpty = firePointSet.isEmpty();
            boolean icePointIsEmpty = icePointSet.isEmpty();
            boolean treePointIsEmpty = treePointSet.isEmpty();
            boolean earthPointIsEmpty = earthPointSet.isEmpty();
            boolean waterPointIsEmpty = waterPointSet.isEmpty();

            // 各属性を最初に選んだ場合についてそれぞれ最短経路を求める
            int minLenType = -1;
            int minLen = Integer.MAX_VALUE;
            for (int firstType = 0; firstType < 5; firstType++) {
                //最初の一匹以外のいずれかの属性のパチモンがいない場合到達不能
                if(
                    firstType == 0 && (
                        icePointIsEmpty ||
                        treePointIsEmpty ||
                        earthPointIsEmpty ||
                        waterPointIsEmpty
                    ) ||
                    firstType == 1 && (
                        firePointIsEmpty ||
                        treePointIsEmpty ||
                        earthPointIsEmpty ||
                        waterPointIsEmpty
                    ) ||
                    firstType == 2 && (
                        firePointIsEmpty ||
                        icePointIsEmpty ||
                        earthPointIsEmpty ||
                        waterPointIsEmpty
                    ) ||
                    firstType == 3 && (
                        firePointIsEmpty ||
                        icePointIsEmpty ||
                        treePointIsEmpty ||
                        waterPointIsEmpty
                    ) ||
                    firstType == 4 && (
                        firePointIsEmpty ||
                        icePointIsEmpty ||
                        treePointIsEmpty ||
                        earthPointIsEmpty
                    )
                ) {
                    continue;
                }

                //スタートからのつながりを生成
                //最初に選ぶタイプで捕まえられるタイプに進める。
                start.nextPointSet.clear();
                start.nextPointSet.addAll(pointSetListByType.get((firstType + 1) % 5));

                 //最短経路を探索
                int shortestPathLen = searchShortestPath(firstType);

                if(minLen > shortestPathLen) {
                    minLen = shortestPathLen;
                    minLenType = firstType;
                }

                // 計算で更新された項目の初期化
                for(Set<Point> pointSet : pointSetListByType) {
                    for(Point p : pointSet) {
                        p.distanceFromStart = Integer.MAX_VALUE;
                    }
                }
                goal.distanceFromStart = Integer.MAX_VALUE;
            }

            if(minLen == Integer.MAX_VALUE) {
                System.out.println("NA");
            } else {
                System.out.println((minLenType + 1) + " " + minLen);
            }
        }
    }

    private static int searchShortestPath(int firstType) {
        int lastType = (firstType + 4) % 5;
        
        PriorityQueue<Point> q = new PriorityQueue<Point>(
                            5002,
                            new Comparator<Point>() {
                                @Override
                                public int compare(Point p1, Point p2) {
                                    return p1.distanceFromStart - p2.distanceFromStart;
                                }
                            }
                        );

        q.add(start);
        Point searchingPoint = start;

        while(!q.isEmpty()) {
             //スタートからの距離が最小のものを頂点集合から削除
            searchingPoint = q.poll();
            
            if(searchingPoint.id == goal.id) break;

            if(searchingPoint.type == lastType) {
                int distance = searchingPoint.distance(goal);
                int searchinPointDistance = searchingPoint.distanceFromStart;
                if(goal.distanceFromStart > searchinPointDistance + distance) {
                    goal.distanceFromStart = searchinPointDistance + distance;
                    q.add(goal);
                }
            } else {
                //検索中のノードから繋がっているものを走査
                for(Point tempNextPoint : searchingPoint.nextPointSet) {
                    int distance = searchingPoint.distance(tempNextPoint);
                    int searchinPointDistance = searchingPoint.distanceFromStart;
                    if(tempNextPoint.distanceFromStart > searchinPointDistance + distance) {
                        tempNextPoint.distanceFromStart = searchinPointDistance + distance;
                        q.add(tempNextPoint);
                    }
                }
            }
        }
 
        //探索完了
        return goal.distanceFromStart;
    }
}   