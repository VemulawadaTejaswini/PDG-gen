import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = Integer.parseInt(scan.next());
		int x = 0;
		int y = 0;
		int t = 0;
		boolean possible = true;
		for(int i=0; i<n; ++i) {
			int ti = Integer.parseInt(scan.next());
			int xi = Integer.parseInt(scan.next());
			int yi = Integer.parseInt(scan.next());

			int kyori = Math.abs(x-xi) + Math.abs(y-yi);
			int jikokuNoSa = Math.abs(ti - t);

			if(kyori <=  jikokuNoSa && Math.abs(jikokuNoSa - kyori) % 2 == 0) {
				t = ti;
				x = xi;
				y = yi;
			} else {
				possible = false;
				break;
			}
		}
		scan.close();

		if(possible) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}

}
