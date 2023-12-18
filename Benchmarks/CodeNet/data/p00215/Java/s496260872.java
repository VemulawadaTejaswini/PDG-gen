import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Comparator;
 
class Point {
    public static int nextId = 0;

    public int id;
    public int x;
    public int y;
    public int distanceFromStart;
    public List<Point> nextPointList;
    public boolean canGoGoal;

    public Point(int x, int y) {
        this.id = nextId++;
        this.x = x;
        this.y = y;
        this.distanceFromStart = Integer.MAX_VALUE;
        this.canGoGoal = false;
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
    public static int pointCount = 0;

    //パチモンのタイプ毎の頂点リスト
    public static List<List<Point> > pointListByType =
            new ArrayList<List<Point> >();
    static {
        // 枠だけ用意
        for(int i = 0; i < 5; i++) {
            pointListByType.add(new ArrayList<Point>());
        }
    }

    public static void main(String args[]) throws IOException {
        while(true) {
            String mapSizeStr = br.readLine();
            if("0 0".equals(mapSizeStr)) break;

            String[] splittedStr = mapSizeStr.split(" ");
            int x = Integer.parseInt(splittedStr[0]);
            int y = Integer.parseInt(splittedStr[1]);
             
            for(int i = 0; i < 5; i++) {
                pointListByType.get(i).clear();
            }
 
            pointCount = 0;
            Point.nextId = 0;
 
            for(int r = 0; r < y; r++){
                String line = br.readLine();
                for(int c = 0; c < x; c++) {
                    char pointLiteral = line.charAt(c);
                    switch(pointLiteral) {
                    case 'S':
                        start = new Point(c, r);
                        start.nextPointList = new ArrayList<Point>();
                        pointCount++;
                        break;
                    case 'G':
                        goal = new Point(c, r);
                        goal.nextPointList = new ArrayList<Point>();
                        pointCount++;
                        break;
                    case '1':case '2':case '3':case '4':case '5':
                        int type = (int)pointLiteral - (int)'1';
                        pointListByType.get(type).add(new Point(c, r));
                        pointCount++;
                        break;
                    }
                }
            }
             
            //到達不可能判定
            //1匹もパチモンがいない属性が2つ以上あれば、到達不能
            int zeroTypeCount = 0;
            for(int i = 0 ; i < 5; i++) {
                if(pointListByType.get(i).size() == 0) {
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
            List<Point> firePointList = pointListByType.get(0);
            List<Point> icePointList = pointListByType.get(1);
            List<Point> treePointList = pointListByType.get(2);
            List<Point> earthPointList = pointListByType.get(3);
            List<Point> waterPointList = pointListByType.get(4);
            //  fire to ice
            for (Point p : firePointList) {
                p.nextPointList = icePointList;
            }
            //  ice to tree
            for (Point p : icePointList) {
                p.nextPointList = treePointList;
            }
            //  tree to earth
            for (Point p : treePointList) {
                p.nextPointList = earthPointList;
            }
            //  earth to water
            for (Point p : earthPointList) {
                p.nextPointList = waterPointList;
            }
            //  water to fire
            for (Point p : waterPointList) {
                p.nextPointList = firePointList;
            }

            // 各属性を最初に選んだ場合についてそれぞれ最短経路を求める
            int minLenType = -1;
            int minLen = Integer.MAX_VALUE;
            for (int firstType = 0; firstType < 5; firstType++) {
                //最初の一匹以外のいずれかの属性のパチモンがいない場合到達不能
                if(
                    firstType == 0 && (
                        pointListByType.get(1).size() == 0 ||
                        pointListByType.get(2).size() == 0 ||
                        pointListByType.get(3).size() == 0 ||
                        pointListByType.get(4).size() == 0
                    ) ||
                    firstType == 1 && (
                        pointListByType.get(0).size() == 0 ||
                        pointListByType.get(2).size() == 0 ||
                        pointListByType.get(3).size() == 0 ||
                        pointListByType.get(4).size() == 0
                    ) ||
                    firstType == 2 && (
                        pointListByType.get(0).size() == 0 ||
                        pointListByType.get(1).size() == 0 ||
                        pointListByType.get(3).size() == 0 ||
                        pointListByType.get(4).size() == 0
                    ) ||
                    firstType == 3 && (
                        pointListByType.get(0).size() == 0 ||
                        pointListByType.get(1).size() == 0 ||
                        pointListByType.get(2).size() == 0 ||
                        pointListByType.get(4).size() == 0
                    ) ||
                    firstType == 4 && (
                        pointListByType.get(0).size() == 0 ||
                        pointListByType.get(1).size() == 0 ||
                        pointListByType.get(2).size() == 0 ||
                        pointListByType.get(3).size() == 0
                    )
                ) {
                    continue;
                }

                //make graph
                start.nextPointList.clear();
                for(int i = 0; i < 5; i++) {
                    // from Start to evry point expect Goal
                    if(i == (firstType + 1) % 5) {
                        start.nextPointList.addAll(pointListByType.get(i));
                    }
                }

                for(Point p :  pointListByType.get((firstType + 4) % 5)) {
                    p.canGoGoal = true;
                }

                 //search shortest path
                int shortestPathLen = searchShortestPath();

                if(minLen > shortestPathLen) {
                    minLen = shortestPathLen;
                    minLenType = firstType;
                }

                // 計算で更新された項目の初期化
                for(int j = 0; j < pointListByType.get((firstType + 4) % 5).size(); j++) {
                    pointListByType.get((firstType + 4) % 5).get(j).canGoGoal = false;
                }
                for(int i = 0; i < 5; i++) {
                    List<Point> tempPointList = pointListByType.get(i);
                    for(int j = 0; j < tempPointList.size(); j++) {
                        Point tempPoint = tempPointList.get(j);
                        tempPoint.distanceFromStart = Integer.MAX_VALUE;
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

    private static int searchShortestPath() {
        start.distanceFromStart = 0;
        int searchedPointCount = 0;
        
        Point searchingPoint = start;
        PriorityQueue<Point> q = new PriorityQueue<Point>(
                            pointCount,
                            new Comparator<Point>() {
                                @Override
                                public int compare(Point p1, Point p2) {
                                    //if(p1.distanceFromStart != p2.distanceFromStart) {
                                        return p1.distanceFromStart - p2.distanceFromStart;
                                    //}
                                    //return p1.id - p2.id;
                                }
                            }
                        );

        q.add(start);

        while(!q.isEmpty()) {
             //スタートからの距離が最小のものを頂点集合から削除
            searchingPoint = q.poll();

            if(searchingPoint.id == goal.id) break;

            if(searchingPoint.canGoGoal) {
                int distance = searchingPoint.distance(goal);
                if(goal.distanceFromStart > searchingPoint.distanceFromStart + distance) {
                    goal.distanceFromStart = searchingPoint.distanceFromStart + distance;
                    q.add(goal);
                }
            }
            //検索中のノードから繋がっているものを走査
            for(Point tempNextPoint : searchingPoint.nextPointList) {
                int distance = searchingPoint.distance(tempNextPoint);
                if(tempNextPoint.distanceFromStart > searchingPoint.distanceFromStart + distance) {
                    tempNextPoint.distanceFromStart = searchingPoint.distanceFromStart + distance;
                    q.add(tempNextPoint);
                }
            }
        }
 
        //探索完了
        return goal.distanceFromStart;
    }
}   