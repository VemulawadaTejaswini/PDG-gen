import java.util.Scanner; 
import java.lang.Math;

public class Main { 
     public static void main(String[] args) { 
         Scanner sc = new Scanner(System.in);
         int n = Integer.parseInt(sc.next());

         System.out.println(solve(n));
     } 
    public static int solve(int n) {
        int ans = 0;
        for (int i = 1; i <= n; i++) {
             int digit = (int) Math.log10(i) + 1;
             if (digit %2==1) {
                ans++;
             } 
         } 
         return ans;
     } 
} 