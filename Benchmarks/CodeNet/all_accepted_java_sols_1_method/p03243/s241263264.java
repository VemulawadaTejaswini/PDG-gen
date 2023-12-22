import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double div = (double) n / 111;
		if (div % 1 == 0) {
			System.out.println(((int) div) * 111);
		} else {
			System.out.println(((int) div + 1) * 111);
		}
	}
}