import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();

		int xPrices = b * (int)Math.ceil((double)n / a);
		int yPrices = d * (int)Math.ceil((double)n / c);

		if(xPrices <= yPrices) {
			System.out.println(xPrices);
		} else {
			System.out.println(yPrices);
		}
	}

}

