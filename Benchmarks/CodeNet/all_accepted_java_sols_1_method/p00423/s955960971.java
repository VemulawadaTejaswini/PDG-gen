import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		new Main();
	}

	public Main() {
		Scanner in = new Scanner(System.in);

		while(true) {
			int n = in.nextInt();
			if(n==0) break;
			int a = 0;
			int b = 0;
			for(int i=0; i<n; i++) {
				int ac = in.nextInt();
				int bc = in.nextInt();
				if(ac > bc) a += ac + bc;
				if(ac == bc){ a += ac; b += bc; }
				if(ac < bc) b += ac + bc;
			}

			System.out.printf("%d %d\n", a, b);
		}
	}
}