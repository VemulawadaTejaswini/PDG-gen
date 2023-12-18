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
		int H, W;
		
		for (;;) {
			H = sc.nextInt();
			W = sc.nextInt();
			if (H == 0 && W == 0) break;
			
			int cnt = 0;
			for (int i = 0; i < H; i++) {
				if (i%2 == 0) cnt=0;
				else cnt=1;
				for (int j = 0; j < W; j++) {
					if (cnt%2 == 0) System.out.print("#");
					else System.out.print(".");
					cnt++;
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}

