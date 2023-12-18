import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Comparator;
  
class Point{
    public static int nextId = 0;
 
    public int id;
    public int x;
    public int y;
    /** ???????????????????????????0?4??????????????????-1???S???G??? */
    public int type;
    public int distanceFromStart;
 
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
 
    //????????¢????????????????????????????????????
    public static List<List<Point> > pointListByType =
            new ArrayList<List<Point> >();
    
    
    public static List<Point> firePointList;
    public static List<Point> icePointList;
    public static List<Point> treePointList;
    public static List<Point> earthPointList;
    public static List<Point> waterPointList;
    
    static {
        // ???????????¨???
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
              
            for(List<Point> pointList : pointListByType) {
                pointList.clear();
            }
            Point.nextId = 0;
  
            for(int r = 0; r < y; r++){
                String line = br.readLine();
                for(int c = 0; c < x; c++) {
                    char pointLiteral = line.charAt(c);
                    if(pointLiteral == 'S') {
                        start = new Point(c, r, -1);
                        start.distanceFromStart = 0;
                    } else if(pointLiteral == 'G') {
                        goal = new Point(c, r, -1);
                    } else if(pointLiteral != '.') {
                        int type = (int)pointLiteral - (int)'1';
                        pointListByType.get(type).add(new Point(c, r, type));
                    }
                }
            }
 
            // ????±???§???????????????????????????
            firePointList = pointListByType.get(0);
            icePointList = pointListByType.get(1);
            treePointList = pointListByType.get(2);
            earthPointList = pointListByType.get(3);
            waterPointList = pointListByType.get(4);
 
            // ????±???§???????????????????????´???????????????????????????????????????????±???????
            int minLenType = -1;
            int minLen = Integer.MAX_VALUE;
            for (int firstType = 0; firstType < 5; firstType++) { 
                 //?????????????????¢?´¢
                int shortestPathLen = searchShortestPath(firstType);
 
                if(minLen > shortestPathLen) {
                    minLen = shortestPathLen;
                    minLenType = firstType;
                }
 
                // ?¨??????§??´??°???????????????????????????
                for(List<Point> pointList : pointListByType) {
                    for(Point p : pointList) {
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
        start.type = firstType  ;
        
        while(!q.isEmpty()) {
             //??????????????????????????¢???????°?????????????????????????????????????
            searchingPoint = q.poll();
            
            //??´???????????§??¢?´¢?????????????????????
            if(searchingPoint.id == goal.id) return goal.distanceFromStart;
 
            if(searchingPoint.type == lastType) {
                int distance = searchingPoint.distance(goal);
                int searchinPointDistance = searchingPoint.distanceFromStart;
                if(goal.distanceFromStart > searchinPointDistance + distance) {
                    goal.distanceFromStart = searchinPointDistance + distance;
                    q.add(goal);
                }
            } else {
                //????´¢?????????????????????????????£????????????????????°???
                List<Point> nextPointList = pointListByType.get((searchingPoint.type + 1) % 5);
                for(Point tempNextPoint : nextPointList) {
                    int distance = searchingPoint.distance(tempNextPoint);
                    int searchinPointDistance = searchingPoint.distanceFromStart;
                    if(tempNextPoint.distanceFromStart > searchinPointDistance + distance) {
                        tempNextPoint.distanceFromStart = searchinPointDistance + distance;
                        q.add(tempNextPoint);
                    }
                }
            }
        }
  
        //??´????????????????????????????????´?????????????????????
        return Integer.MAX_VALUE;
    }
}   