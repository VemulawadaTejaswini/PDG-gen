import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		double bitcoin = 0;
		int jpyEn = 0;
		
		for (int i = 0; i < N; i++) {
			double x = sc.nextDouble();
			String s = sc.next();
			if (s.equals("JPY")) {
				jpyEn += x;
			} else {
				bitcoin += x;
			}
		}
		
		System.out.println(jpyEn + (bitcoin * 380000));
	}
}
