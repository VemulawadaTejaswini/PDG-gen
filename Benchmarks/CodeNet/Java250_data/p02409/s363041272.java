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
        int flg[][][] = new int[4][3][10];
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 3; j++) {
				for (int k = 0; k < 10; k++) {
					flg[i][j][k] = 0;
				}
			}
		}
    	
    	int n = sc.nextInt();
        
        for (int i = 0; i < n; i++) {
        	int b,f,r,v;
        	b = sc.nextInt();
        	f = sc.nextInt();
        	r = sc.nextInt();
        	v = sc.nextInt();
        	flg[b-1][f-1][r-1] += v;
		}
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 3; j++) {
				for (int k = 0; k < 10; k++) {
					System.out.print(" " + flg[i][j][k]);
				}
				System.out.println();
			}
			if (i != 3) {
				System.out.println("####################");
			}
		}
    }
}

