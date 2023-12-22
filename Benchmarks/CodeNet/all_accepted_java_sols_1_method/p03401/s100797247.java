import java.util.*;
	public class Main{
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            //入力
            int n = Integer.parseInt(sc.next());
            long[] points = new long[n+2];
            long sum = 0;
            points[0] = 0;
            points[n+1] = 0;
            
            for(int i=1; i<n+1; i++){
            	points[i] = Long.parseLong(sc.next());
            	sum += Math.abs(points[i-1] - points[i]);
            }
            sum += Math.abs(points[n]);
            
            //出力
            for(int i=1; i<n+1; i++){
            	System.out.println(sum - Math.abs(points[i] - points[i-1]) - Math.abs(points[i] - points[i+1]) + Math.abs(points[i+1] - points[i-1]));
            }
            sc.close();
        }
    }
