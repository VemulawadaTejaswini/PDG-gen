import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        
        int A[][] = new int[3][3];
        boolean B[][] = new boolean[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                A[i][j] = in.nextInt();
                B[i][j] = false;
            }
        }
        
        int N = in.nextInt();
        for (int n = 0; n < N; n++) {
            int a = in.nextInt();
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (A[i][j] == a) {
                        B[i][j] = true;
                        continue;
                    }
                }
            }
        }        
        
        for (int i = 0; i < 3; i++) {
            if (B[i][0] && B[i][1] && B[i][2]) {
                System.out.println("Yes");
                return;
            }
            
            if (B[0][i] && B[1][i] && B[2][i]) {
                System.out.println("Yes");
                return;
            }
        }
        
        if (B[0][0] && B[1][1] && B[2][2]) {
            System.out.println("Yes");
            return;
        }
        
        if (B[0][2] && B[1][1] && B[2][0]) {
            System.out.println("Yes");
            return;
        }
         
        System.out.println("No");
    }
}
