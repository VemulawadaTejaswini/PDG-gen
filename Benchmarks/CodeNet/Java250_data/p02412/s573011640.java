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
        int n, x;
        
        for (;;) {
        	n = sc.nextInt();
        	x = sc.nextInt();
        	if (n == 0 && x == 0) break;
        	int cnt = 0;
        	for (int i = 1; i <= n; i++) {
        		for (int j = i+1; j <= n; j++) {
        			for (int k = j+1; k <= n; k++) {
        				if (i+j+k == x) cnt++;
					}
				}
			}
			System.out.println(cnt);
		}
    }
}

