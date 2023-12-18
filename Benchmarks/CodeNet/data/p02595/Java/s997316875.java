import java.util.*;


public class Main {
    public static void main(String[] args) {
        int count = 0;
        Scanner sc = new Scanner(System.in);
      
        int times = sc.nextInt();//点の個数
        int distance = sc.nextInt();//距離
      
        for(int i = 0; i < times; i++) {
        	int x = sc.nextInt();
            int y = sc.nextInt();
            double ans = Math.sqrt(x*x + y*y);
            if(ans <= distance) {
            	count++;
            }
        }
        System.out.println(count);
    }
}