import java.io.ByteArrayInputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    String INPUT = "";

    public static void main(String[] args) throws Exception {
        new Main().run();
    }

    void run() {
        Scanner sc = INPUT.isEmpty() ? new Scanner(System.in) : new Scanner(new ByteArrayInputStream(INPUT.getBytes()));
        PrintWriter out = new PrintWriter(System.out);

        solve(sc, out);
        out.flush();
    }

    void solve(Scanner sc, PrintWriter out) {
        int n, m, l;
        
        n = sc.nextInt();
        m = sc.nextInt();
        l = sc.nextInt();
        long A[][] = new long[n][m];
        long B[][] = new long[m][l];
        long C[][] = new long[n][l];
        for (int i = 0; i < n; i++) {
        	for (int j = 0; j < m; j++) {
        	    A[i][j] = sc.nextLong();
            }
		}
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < l; j++) {
                B[i][j] = sc.nextLong();
            }
        }
        for(int i = 0; i < n; i++){
            for(int j = 0; j < l; j++){
                for(int k = 0; k < m; k++){
                    C[i][j] += A[i][k]*B[k][j];
                }
            
                if(j != 0 ){
                    System.out.print(" ");
                }
                System.out.print(C[i][j]);
            }
            System.out.println();
        }
    }
}

