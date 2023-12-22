import java.util.*;

public class Main {
    public static int[][][] memo;
    
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            int M = sc.nextInt();
            int Nmin = sc.nextInt();
            int Nmax = sc.nextInt();
            if (M == 0 && Nmin == 0 && Nmax == 0) break;
            
            int[] arr = new int[M];
            
            for (int i = 0; i < M; i++) {
                arr[i] = sc.nextInt();
            }
            
            int gap = -9999;
            int ans = -99;
            
            for (int n = Nmin; n <= Nmax; n++) {
                int g = arr[n-1] - arr[n];
                if (gap <= g) {
                    gap = g;
                    ans = n;
                }
            }
            
            System.out.println(ans);
        }
    }
}


