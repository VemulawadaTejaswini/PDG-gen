import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Comparator;
  
class Point implements Comparable<Point>{
    public static int nextId = 0;
   
    public int id;
    public int x;
    public int y;
    public int type;
    public int distanceFromStart;
     
    public Point() {
        this(-1, -1, -1);
    }
      
    public Point(int x, int y, int type) {
        init(x, y, type);
    }
   
    public int distance(Point p) {
        return abs(this.x - p.x) + abs(this.y - p.y);
    }
      
    public void init(int x, int y, int type){
        this.id = nextId++;
        this.x = x;
        this.y = y;
        this.type = type;
        this.distanceFromStart = Integer.MAX_VALUE;
    }
     
    @Override
    public int compareTo(Point p) {
        return this.distanceFromStart - p.distanceFromStart;
    }
      
    private static int abs(int n) {
        int mask = n >> 31;
        return (n ^ mask) - mask;
    }
}
   
public class Main {
    public static final BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
   
    public static final Point start = new Point();
    public static final Point goal = new Point();
 
    public static final PriorityQueue<Point> q = new PriorityQueue<Point>();
  
    public static final List<Point> allPachiCrePointList = new ArrayList<Point>();
      
    public static final List<List<Point> > pointListByType =
            new ArrayList<List<Point> >();
      
    static {
        for(int i = 0; i < 5; i++) {
            pointListByType.add(new ArrayList<Point>());
        }
    }
   
    public static void main(String args[]) throws IOException {
        while(true) {
            String mapSizeStr = br.readLine();
            if("0 0".equals(mapSizeStr)) break;
   
            String[] splittedStr = mapSizeStr.split(" ");
            final int x = Integer.parseInt(splittedStr[0]);
            final int y = Integer.parseInt(splittedStr[1]);
                  
            for(int i = 0; i < 5; i++) {
                pointListByType.get(i).clear();
            }
            Point.nextId = 0;
   
            for(int r = 0; r < y; r++){
                String line = br.readLine();
                final char[] caray = line.toCharArray();
                for(int c = 0; c < x; c++) {
                    char pointLiteral = caray[c];
                    if(pointLiteral == '.') {
                        continue;
                    } else if(pointLiteral == 'S') {
                        start.init(c, r, -1);
                        start.distanceFromStart = 0;
                    } else if(pointLiteral == 'G') {
                        goal.init(c, r, -1);
                    } else {
                        int type = (int)pointLiteral - (int)'1';
                        Point p = new Point(c, r, type);
                        pointListByType.get(type).add(p);
                    }
                }
            }
   
            int minLenType = -1;
            int minLen = Integer.MAX_VALUE;
            for (int firstType = 0; firstType < 5; firstType++) { 
                int shortestPathLen = searchShortestPath(firstType, minLen);
   
                if(minLen > shortestPathLen) {
                    minLen = shortestPathLen;
                    minLenType = firstType;
                }
   
                for(int i = 0; i < 5; i++) {
                    List<Point> tempPointList = pointListByType.get(i);
                    for(int j = 0; j < tempPointList.size(); j++) {
                        tempPointList.get(j).distanceFromStart = Integer.MAX_VALUE;
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
   
    private static int searchShortestPath(int firstType, int minLen) {
        final int lastType = (firstType + 4) % 5;
             
        q.clear();
   
        q.add(start);
        start.type = firstType;
            
        while(!q.isEmpty()) {
            Point searchingPoint = q.poll();
 
            if(searchingPoint.distanceFromStart >= minLen) return Integer.MAX_VALUE;
            if(searchingPoint.id == goal.id) return goal.distanceFromStart;
 
            if(searchingPoint.type == lastType) {
                final int distance = searchingPoint.distance(goal);
                final int searchinPointDistance = searchingPoint.distanceFromStart;
                if(goal.distanceFromStart > searchinPointDistance + distance) {
                    goal.distanceFromStart = searchinPointDistance + distance;
                    q.add(goal);
                }
            } else {
                List<Point> nextPointList = pointListByType.get((searchingPoint.type + 1) % 5);
                int nextPointListSize = nextPointList.size();
                for(int i = 0; i < nextPointListSize; i++) {
                    Point tempNextPoint = nextPointList.get(i);
                    final int distance = searchingPoint.distance(tempNextPoint);
                    final int searchinPointDistance = searchingPoint.distanceFromStart;
                    if(tempNextPoint.distanceFromStart > searchinPointDistance + distance) {
                        tempNextPoint.distanceFromStart = searchinPointDistance + distance;
                        q.add(tempNextPoint);
                    }
                }
            }
        }
        return Integer.MAX_VALUE;
    }
}   