import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double price = n / 1.08;
		if((int)((int)price * 1.08) == n) {
			System.out.println((int)price);
		}else if((int)(((int)price + 1) * 1.08) == n) {
			System.out.println((int)price + 1);
		}else {
			System.out.println(":(");
		}

		sc.close();
	}
}
