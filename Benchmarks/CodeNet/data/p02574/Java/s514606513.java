import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        final int N = sc.nextInt();
        final int[] A = new int[N];
        
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        
        int d = 2;
        long completed = 0;
        long total = N * (N + 1) / 2;
        boolean canDiv2 = false;
        {
            int div = 0;
            
            for (int i = 0; i < N; i++) {
                boolean canDiv = false;
                
                while (A[i] % d == 0 && 0 < A[i] / d) {
                    A[i] /= d;
                    canDiv = true;
                }
                if (A[i] == 1) {
                    completed += i;
                }
                
                if (canDiv) {
                    div++;
                }
            }
            if (div == N) {
                System.out.println("not coprime");
                return;
                
            } else if (2 <= div) {
                canDiv2 = true;
            }
        }
        
        d = 3;
        while (completed < total) {
            int div = 0;
            
            for (int i = 0; i < N; i++) {
                boolean canDiv = false;
                
                while (A[i] % d == 0 && 0 < A[i] / d) {
                    A[i] /= d;
                    canDiv = true;
                }
                if (A[i] == 1) {
                    completed += i;
                }
                
                if (canDiv) {
                    div++;
                }
            }
            if (div == N) {
                System.out.println("not coprime");
                return;
                
            } else if (2 <= div) {
                canDiv2 = true;
            }
            
            d += 2;
        }
        
        System.out.println(canDiv2 ? "setwise coprime" : "pairwise coprime");
    }
}
