import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
      
public class Main {
    public static void main(String[] args) {
        Main instance = new Main();
        instance.execute();
    }
          
    private void execute() {
        Scanner sc = new Scanner(System.in);
              
        while(true) {
            Point[] points = toPointArray(sc);
            if(points == null){break;}
            System.out.println(sampling(points,
                                        new Point(0.5, 0.5),
                                        new Point(9.5, 9.5),
                                        1, 
                                        2));
        }
    }
      
    private int sampling(Point[] points, Point start, Point end, double distance, int recursiveCount) {
        int max = 0;
        int count;
        List<Point> maxPoints = new ArrayList<Point>();
        for(double x = start.x ; x <= end.x ; x += distance) {
            for(double y = start.y ; y <= end.y ; y += distance) {
                count = countOver(points, x, y);
                if(count > max) {
                    max = count;
                    maxPoints.clear();
                }
                if(count == max) {
//                	System.out.println("count=" + count + ", x=" + x + ", y=" + y);
                    maxPoints.add(new Point(x, y));
                }
            }
        }
          
        if(recursiveCount > 1) {
            for(Point maxPoint : maxPoints) {
                max = Math.max(max, 
                                sampling(points,
                                        new Point(maxPoint.x - distance/2, maxPoint.y - distance/2),
                                        new Point(maxPoint.x + distance/2, maxPoint.y + distance/2),
                                        distance / 10,
                                        recursiveCount - 1));
            }
        }
          
        return max;
    }
      
    private int countOver(Point[] points, double x, double y) {
        int count = 0;
        for(Point p : points) {
            if(p.isOver(x, y)){count++;}
        }
        return count;
    }
      
    /**
     * BufferReaderから取得した座標情報をPointインスタンスの配列に変換する
     */
    private Point[] toPointArray(Scanner sc) {
    	int rows = sc.nextInt();
    	if(rows == 0){return null;}
    	
        Point[] dataArray = new Point[rows];
              
        String[] line;
        for(int i = 0 ; i < rows ; i++) {
            line = sc.next().split(",");
            dataArray[i] = new Point(Double.parseDouble(line[0]), Double.parseDouble(line[1]));
        }
        return dataArray;
    }
      
    private class Point {
        double x, y;
        Point(double x, double y) {
            this.x = x;
            this.y = y;
        }
          
        boolean isOver(double x, double y) {
            return Math.pow(this.x - x, 2) + Math.pow(this.y - y, 2) <= 1;
        }
    }
}