import java.util.*;
import java.io.*;
import java.math.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double t = sc.nextDouble();
        double a = sc.nextDouble();
        double rem = Integer.MAX_VALUE;
        int ans = 0;
        for(int i = 1; i <= n; i++){
            double h = sc.nextDouble();
            if(rem > Math.abs(t-h*0.006-a)){
                ans = i;
                rem = Math.abs(t-h*0.006-a);
            }
        }
        System.out.println(ans);
    }
}