import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

class Point {
    public static int nextId = 0;
    public int id;
    public int x;
    public int y;

    public Point(int x, int y) {
        this.id = nextId++;
        this.x = x;
        this.y = y;
    }

    public int distance(Point p) {
        return Math.abs(this.x - p.x) + Math.abs(this.y - p.y);
    }
}

public class Main {
    public static BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
    public static int[] shortestPath;
    public static List<Integer> typeById;

    public static void main(String args[]) throws IOException {
        while(true) {
            String mapSizeStr = br.readLine();
            if("0 0".equals(mapSizeStr)) break;

            String[] splittedStr = mapSizeStr.split(" ");
            int x = Integer.parseInt(splittedStr[0]);
            int y = Integer.parseInt(splittedStr[1]);
            
            List<List<Point> > pointListByType =
                    new ArrayList<List<Point> >();

            for(int i = 0; i < 5; i++) {
                pointListByType.add(new ArrayList<Point>());
            }
            int pointCount = 0;
            Point start = null;
            Point goal = null;
            Point.nextId = 0;
            shortestPath = new int[6];
            Arrays.fill(shortestPath, -1);
            typeById = new ArrayList<Integer>();

            for(int r = 0; r < y; r++){
                String line = br.readLine();
                for(int c = 0; c < x; c++) {
                    char pointLiteral = line.charAt(c);
                    switch(pointLiteral) {
                    case 'S':
                        start = new Point(c, r);
                        typeById.add(0);
                        pointCount++;
                        break;
                    case 'G':
                        goal = new Point(c, r);
                        typeById.add(6);
                        pointCount++;
                        break;
                    case '1':case '2':case '3':case '4':case '5':
                        int type = (int)pointLiteral - (int)'1';
                        pointListByType.get(type).add(new Point(c, r));
                        typeById.add(type);
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
                int [] graph = new int[pointCount * pointCount];
                Arrays.fill(graph, Integer.MAX_VALUE);

                for(int i = 0; i < pointListByType.size(); i++) {
                    List<Point> tempPointList = pointListByType.get(i);
                    for(int j = 0; j < tempPointList.size(); j++) {
                        Point tempPoint = tempPointList.get(j);
                        // from Start to evry point expect Goal
                        if(i == (firstType + 1) % 5) {
                            setGraph(graph, start, tempPoint, pointCount);
                        }
                        // to goal from every point expect Start
                        if(i == (firstType + 4) % 5) {
                            setGraph(graph,tempPoint, goal, pointCount);
                        }
                    }
                } 
                
                // from any Point to Point
                List<Point> firePointList = pointListByType.get(0);
                List<Point> icePointList = pointListByType.get(1);
                List<Point> treePointList = pointListByType.get(2);
                List<Point> earthPointList = pointListByType.get(3);
                List<Point> waterPointList = pointListByType.get(4);
                //  fire to ice
                for (int i = 0; i < firePointList.size(); i++) {
                    for (int j = 0; j < icePointList.size(); j++) {
                        setGraph(
                            graph,
                            firePointList.get(i),
                            icePointList.get(j),
                            pointCount
                        );
                    }
                }
                //  ice to tree
                for (int i = 0; i < icePointList.size(); i++) {
                    for (int j = 0; j < treePointList.size(); j++) {
                        setGraph(
                            graph,
                            icePointList.get(i),
                            treePointList.get(j),
                            pointCount
                        );
                    }
                }
                //  tree to earth
                for (int i = 0; i < treePointList.size(); i++) {
                    for (int j = 0; j < earthPointList.size(); j++) {
                        setGraph(
                            graph,
                            treePointList.get(i),
                            earthPointList.get(j),
                            pointCount
                        );
                    }
                }
                //  earth to water
                for (int i = 0; i < earthPointList.size(); i++) {
                    for (int j = 0; j < waterPointList.size(); j++) {
                        setGraph(
                            graph,
                            earthPointList.get(i),
                            waterPointList.get(j),
                            pointCount
                        );
                    }
                }
                //  water to fire
                for (int i = 0; i < waterPointList.size(); i++) {
                    for (int j = 0; j < firePointList.size(); j++) {
                        setGraph(
                            graph,
                            waterPointList.get(i),
                            firePointList.get(j),
                            pointCount
                        );
                    }
                }

                //search shortest path
                int shortestPathLen = 
                        searchShortestPath(graph, start, goal, pointCount);

                if(minLen > shortestPathLen) {
                    minLen = shortestPathLen;
                    minLenType = firstType;
                }
            }

            if(minLen == Integer.MAX_VALUE) {
                System.out.println("NA");
            } else {
                System.out.println((minLenType + 1) + " " + minLen);
            }
        }
    }

    private static void setGraph(
                    int[] graph,
                    Point fromPoint,
                    Point toPoint,
                    int pointCount
    ) {
        graph[fromPoint.id * pointCount + toPoint.id] =
            fromPoint.distance(toPoint);
    }

    private static int searchShortestPath(
        int[] graph, Point start, Point goal, int pointCount
    ) {
        int[] d = new int[pointCount];
        Arrays.fill(d, Integer.MAX_VALUE);
        d[start.id] = 0;
        int[] prevId = new int[pointCount];
        Arrays.fill(prevId, -1);
        int searchedPointCount = 0;
        boolean[] fixed = new boolean[pointCount];
        Arrays.fill(fixed, false);
        
        int searchingId = 0;
        while(searchedPointCount < pointCount - 1) {
            int minD = Integer.MAX_VALUE;
            for(int i = 0; i < pointCount; i++) {
                if(!fixed[i] && minD > d[i]) {
                    fixed[i] = true;
                    searchedPointCount++;
                    minD = d[i];
                    searchingId = i;
                    break;
                }
            }
            for(int i = 0; i < pointCount; i++) {
                if(fixed[i]) continue;
                int distance = graph[searchingId * pointCount + i];
                if(distance == Integer.MAX_VALUE) continue;
                if(d[i] > d[searchingId] + distance) {
                    d[i] = d[searchingId] + distance;
                    prevId[i] = searchingId;
                }
            }
        }

        //探索完了
        return d[goal.id];
    }
}   