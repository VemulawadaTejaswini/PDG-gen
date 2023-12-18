import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int M = Integer.parseInt(sc.next());
        int[] x = new int[M];
        int[] dif = new int[M-1];
        for(int i= 0; i<M; i++) {
            x[i] = Integer.parseInt(sc.next());
        }
        Arrays.sort(x);
        for(int i= 0; i<M-1; i++) {
            dif[i] = x[i+1]-x[i];
        }
        Arrays.sort(dif);
        int ans = 0;
        for(int i=0; i<M-N; i++) {
            ans += dif[i];
        }
        
        System.out.println(ans);
    }
}