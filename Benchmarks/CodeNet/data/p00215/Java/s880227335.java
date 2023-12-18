import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Comparator;

public class Main {
    public static final BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
  
    public static final Point start = new Point();
    public static final Point goal = new Point();

    public static final PriorityQueue<Point> q = new PriorityQueue<Point>();
     
    public static final List<List<Point> > pointListByType =
            new ArrayList<List<Point> >();
     
    static {
        for(int i = 0; i < 5; i++) {
            pointListByType.add(new ArrayList<Point>());
        }
    }
  
    public static void main(String args[]) throws IOException {
        while(true) {
            final String mapSizeStr = br.readLine();
            if("0 0".equals(mapSizeStr)) break;
  
            final String[] splittedStr = mapSizeStr.split(" ");
            final int x = Integer.parseInt(splittedStr[0]);
            final int y = Integer.parseInt(splittedStr[1]);

            for(int i = 0; i < 5; i++) {
                pointListByType.get(i).clear();
            }
            Point.nextId = 0;
  
            for(int r = 0; r < y; r++){
                final String line = br.readLine();
                final char[] caray = line.toCharArray();
                for(int c = 0; c < x; c++) {
                    char pointLiteral = caray[c];
                    switch(pointLiteral) {
                    case '.':
                        //Do Nothing
                        break;
                    case 'S':
                        start.init(c, r, -1);
                        start.distanceFromStart = 0;
                        break;
                    case 'G':
                        goal.init(c, r, -1);
                        break;
                    default:
                        final int type = (int)pointLiteral - (int)'1';
                        pointListByType.get(type).add(new Point(c, r, type));
                    }
                }
            }
  
            int minLenType = -1;
            int minLen = Integer.MAX_VALUE;
            for (int firstType = 0; firstType < 5; firstType++) { 
                final int shortestPathLen = searchShortestPath(firstType, minLen);
  
                if(minLen > shortestPathLen) {
                    minLen = shortestPathLen;
                    minLenType = firstType;
                }
  
                if(firstType == 4) break;
                
                for(int i = 0; i < 5; i++) {
                    if(i == firstType) continue;
                    final List<Point> tempPointList = pointListByType.get(i);
                    final int pointListSize = tempPointList.size();
                    for(int j = 0; j < pointListSize; j++) {
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
  
    private static int searchShortestPath(final int firstType, final int minLen) {
        final int lastType = (firstType + 4) % 5;
            
        q.clear();
  
        q.add(start);
        start.type = firstType;
           
        while(!q.isEmpty()) {
            final Point searchingPoint = q.poll();
            final int searchingPointDistance = searchingPoint.distanceFromStart;

            if(searchingPointDistance >= minLen) return Integer.MAX_VALUE;
            if(searchingPoint.id == goal.id) return goal.distanceFromStart;

            if(searchingPoint.type == lastType) {
                final int distance = searchingPoint.distance(goal);
                if(goal.distanceFromStart > searchingPointDistance + distance) {
                    goal.distanceFromStart = searchingPointDistance + distance;
                    q.add(goal);
                }
            } else {
                final List<Point> nextPointList = pointListByType.get((searchingPoint.type + 1) % 5);
                final int nextPointListSize = nextPointList.size();
                
                for(int i = 0; i < nextPointListSize; i++) {
                    final Point tempNextPoint = nextPointList.get(i);
                    final int distance = searchingPoint.distance(tempNextPoint);
                    if(tempNextPoint.distanceFromStart > searchingPointDistance + distance) {
                        tempNextPoint.distanceFromStart = searchingPointDistance + distance;
                        q.add(tempNextPoint);
                    }
                }
            }
        }
        return Integer.MAX_VALUE;
    }
    
    private static class Point implements Comparable<Point>{
        public static int nextId = 0;
      
        public int id;
        public int x;
        public int y;
        public int type;
        public int distanceFromStart;
        
        public Point() {
            this(-1, -1, -1);
        }
         
        public Point(final int x, final int y, final int type) {
            init(x, y, type);
        }
      
        public int distance(final Point p) {
            return abs(this.x - p.x) + abs(this.y - p.y);
        }
         
        public void init(final int x, final int y, final int type){
            this.id = nextId++;
            this.x = x;
            this.y = y;
            this.type = type;
            this.distanceFromStart = Integer.MAX_VALUE;
        }
        
        @Override
        public int compareTo(final Point p) {
            return this.distanceFromStart - p.distanceFromStart;
        }
         
        private static int abs(final int n) {
            int mask = n >> 31;
            return (n ^ mask) - mask;
        }
    }
}   