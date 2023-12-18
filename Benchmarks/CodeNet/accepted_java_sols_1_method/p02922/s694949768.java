import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		int a,b;

		Scanner sc = new Scanner(System.in);

		a = sc.nextInt();
		b = sc.nextInt();

		int count = 0;
		int totalTapCnt = 1;

		while (totalTapCnt < b) {
			totalTapCnt += a - 1;
			++count;
		}

		System.out.println(count);
	}
}
