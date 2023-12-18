import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double t = sc.nextDouble();
        int a = sc.nextInt();
        int[] h = new int[n];
        for(int i = 0; i < n; i++){
            h[i] = sc.nextInt();
        }
        double ans = 10000;
        int ans_no = 0;
        for(int i = 0; i < n; i++){
            double temp = t - h[i] * 0.006;
            if(ans > Math.abs(a - temp)){
                ans_no = i + 1;
                ans = Math.abs(a - temp);
            }
        }
        System.out.println(ans_no);
    }
}