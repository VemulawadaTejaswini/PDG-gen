import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double n = sc.nextInt();
		sc.close();
		for (double c = 1; c <= 3500; c++) {
			double t1 = 4 * c / n - 1;
			if (t1 <= 0) {
				continue;
			}
			for (double b = 1; b <= 3500; b++) {
				double t2 =b * (4 * c / n - 1) - c ;
				if(t2 <= 0 ) {
					continue;
				}
				double t3 = b * c / (b * (4 * c / n - 1) - c);
				if (t3 < 1) {
					continue;
				}
				int t4 =(int) (b * c / (b * (4 * c / n - 1) - c));
				if (t3 == t4) {
					int a = t4;
					System.out.println(a + " " + (int)b + " " + (int)c);
					return;
				}
			}
		}
	}
}