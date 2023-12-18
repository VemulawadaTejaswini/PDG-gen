import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		try(Scanner sc = new Scanner(System.in)) {
			int h = sc.nextInt();
			int w = sc.nextInt();
			if(h == 1 || w == 1) {
				System.out.println(1);
				System.exit(0);
			}
			double h1 = Math.ceil(h / (double)2);
			double w1 = Math.ceil(w / (double)2);
			double h2 = Math.floor(h / (double)2);
			double w2 = Math.floor(w / (double)2);
			long ans = (long)w1 * (long)h1 + (long)w2 * (long)h2;
			System.out.println(ans);
		}

	}

}
