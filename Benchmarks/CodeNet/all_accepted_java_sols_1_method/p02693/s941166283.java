import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int k = s.nextInt();
		int a = s.nextInt();
		int b = s.nextInt();
		int flag = 0;

		for (int i = 1; k * i <= 1000; i++) {
			if(k * i >= a && k * i <= b) {
				flag++;
			}
		}

		if(flag != 0) {
			System.out.println("OK");
		} else {
			System.out.println("NG");
		}

		s.close();

	}
}
