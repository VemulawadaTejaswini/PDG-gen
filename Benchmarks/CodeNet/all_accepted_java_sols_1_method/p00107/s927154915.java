import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while(sc.hasNext()) {
			int d = sc.nextInt();
			int w = sc.nextInt();
			int h = sc.nextInt();

				if (d == 0 && w == 0 && h == 0) {
					break;
				}

			double a = Math.sqrt(Math.pow(d, 2) + Math.pow(w, 2));
			double b = Math.sqrt(Math.pow(w, 2) + Math.pow(h, 2));
			double c = Math.sqrt(Math.pow(h, 2) + Math.pow(d, 2));

			int n = sc.nextInt();


			for (int i = 0; i < n; i++) {
				int r = sc.nextInt();

				double min = a;
				min = Math.min(b, min);
				min = Math.min(c, min);


				if ( min < r * 2) {
					System.out.println("OK");
				} else {
					System.out.println("NA");
				}
			}

		}
		sc.close();
	}
}
