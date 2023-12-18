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
		int W,H,x,y,r;
		
		W = sc.nextInt();
		H = sc.nextInt();
		x = sc.nextInt();
		y = sc.nextInt();
		r = sc.nextInt();
		if (x+r <= W && x-r >= 0 && y+r <= H && y-r >= 0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		
	}
}

