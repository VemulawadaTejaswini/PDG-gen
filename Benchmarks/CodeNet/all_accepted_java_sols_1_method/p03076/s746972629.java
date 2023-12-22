import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int div = 0;
		for (int i = 0; i < 5; i++) {
			int input = sc.nextInt();
			if (input % 10 == 0) {
				sum += input;
			} else {
				int nowdiv = input % 10;
				sum += input - nowdiv + 10;
				if (div == 0) {
					div = nowdiv;
				} else {
					if (div > nowdiv) {
						div = nowdiv;
					}
				}
			}
		}
		if(div == 0) {
			System.out.println(sum);
		}else {
			System.out.println(sum + div - 10);
		}
		sc.close();
	}
}
