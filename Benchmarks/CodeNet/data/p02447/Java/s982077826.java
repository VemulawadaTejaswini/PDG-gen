import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    static class Point implements Comparable<Point>{
    	int point, x, y;
    	Point(int x, int y) {
    		this.x=x;
    		this.y=y;
    	}
    	public int compareTo(Point p1) {
    		if(p1.x == this.x) {
                return this.y - p1.y;
            }
            return this.x - p1.x;
    	}
    }
    
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
                int n = sc.nextInt();
                ArrayList<Point> pairs=new ArrayList<Point>();
                
                for(int i=0; i<n; i++){
                    int X = sc.nextInt();
                    int Y = sc.nextInt();
                    pairs.add(new Point(X, Y));
                }//準備
                Collections.sort(pairs);
                for(int i = 0; i < n; i++) {
                    System.out.println(pairs.get(i).x+" "+pairs.get(i).y);
                }
                
        }
    }
}
