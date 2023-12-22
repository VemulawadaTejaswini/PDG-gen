import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int T = sc.nextInt();
        int A = sc.nextInt();
        int[] H = new int[N];
        double[] t = new double[N];
        double min = 1000;
        int ans = 0;

        for(int i=0; i<N; i++){
            t[i] = T - sc.nextInt() * 0.006;
            min = Math.min(min, Math.abs(A - t[i]));
            if(min==Math.abs(A-t[i])){
                ans = i + 1;
            }
        }
        System.out.println(ans);
    }
}