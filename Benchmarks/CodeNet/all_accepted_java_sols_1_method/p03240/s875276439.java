import java.util.*;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] x = new int[N];
        int[] y = new int[N];
        int[] h = new int[N];
        for(int i = 0; i < N;i++){
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
            h[i] = sc.nextInt();
        }
        int ansx = 0;
        int ansy = 0;
        int ansh = 0;
        boolean bl = false;
        for(int cx = 0; cx <= 100; cx++){
            for(int cy = 0; cy <= 100; cy++){
                bl = true;
                int index = -1;
                for(int i = 0; i < N; i++){
                    if(h[i] > 0){
                        index = i;
                    }
                }
                int H = h[index] + Math.abs(x[index] - cx) + Math.abs(y[index] - cy);
                for(int i = 0; i < N; i++){
                    if(h[i] != Math.max(0,H - Math.abs(x[i] - cx) - Math.abs(y[i] - cy))){
                        bl = false;
                        break;
                    }
                }
                if(bl){
                    ansh = H;
                    ansx = cx;
                    ansy = cy;
                }
            }
        }
        System.out.println(ansx + " " + ansy + " " + ansh);
    }
}
