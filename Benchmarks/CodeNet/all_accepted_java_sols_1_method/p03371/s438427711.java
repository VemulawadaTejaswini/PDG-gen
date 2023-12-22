import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        int max = Math.max(x,y);
        int min = Math.min(x,y);
        
        int ansA = a * x + b * y;
        int ansB = 2 * c * min + a * (x-min) + b * (y-min);
        int ansC = 2 * c * max;
        int ans = Math.min( Math.min(ansA,ansB),ansC );
        System.out.println(ans);
    }
}