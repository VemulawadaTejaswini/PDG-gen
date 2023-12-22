import java.util.*;

public class Main {
	public static void main(String[] args){
 
        Scanner sc = null;
        sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        double w_num = 0;
        long p = 0;
        long q = 0;
        double sqNum = 0;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            p = sc.nextLong();
            q = sc.nextLong();
            w_num = (double)Math.pow(p, 2) + (double)Math.pow(q, 2);
            sqNum = (double)Math.sqrt(w_num);
            if (sqNum <= d){
                ans += 1;
            }
          }
          sc.close();
        System.out.println(ans);
      
      }
}