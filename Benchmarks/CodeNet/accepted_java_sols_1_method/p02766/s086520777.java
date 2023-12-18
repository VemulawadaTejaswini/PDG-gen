import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int sum = 0;
		while (true) {
			n = n / k;
			sum++;
			if (n == 0) {
				break;
			}
		}
		System.out.println(sum);
	}
}
