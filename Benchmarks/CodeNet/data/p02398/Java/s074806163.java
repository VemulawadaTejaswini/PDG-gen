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
		int x,y,z;
		
		x = sc.nextInt();
		y = sc.nextInt();
		z = sc.nextInt();
		
		int cnt = 0;
		for (int i = x; i <= y; i++) {
			if (z%i == 0) cnt++;
		}
		System.out.println(cnt);
	}
}

