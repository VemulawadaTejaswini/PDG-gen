import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
        int[] h = new int[n+1];
        for(int i = 1; i <= n; i++){
            h[i] = Integer.parseInt(sc.next());
        }
        
        boolean[] good = new boolean[n+1];
        Arrays.fill(good, true);
        for(int i = 0; i < m; i++){
            int a = Integer.parseInt(sc.next());
            int b = Integer.parseInt(sc.next());
            if(h[a] <= h[b]){
                good[a] = false;
            }
            if(h[b] <= h[a]){
                good[b] = false;
            }
        }
        int ans = 0;
        for(int i = 1; i <= n; i++){
            if(good[i]) ans++;
        }
        System.out.println(ans);
    }
}