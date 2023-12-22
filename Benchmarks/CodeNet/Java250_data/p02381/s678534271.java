import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(true){
            int n = sc.nextInt();
            if(n==0) break;
            int[] s = new int[n];
            double ave = 0.0;
            for(int i = 0; i<n; i++){
                s[i] = sc.nextInt();
                ave += s[i];
            }
            ave /= (double)n;
            double v = 0;
            for(int i = 0;i<n;i++){
                v += (s[i] - ave)*(s[i] - ave);
            }
            double ans = Math.sqrt(v/(double)n);
            System.out.printf("%f\n", ans);
        }
        sc.close();
    }
}
