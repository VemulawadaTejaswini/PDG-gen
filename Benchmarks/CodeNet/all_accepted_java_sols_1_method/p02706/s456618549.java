import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		int c = 0;
		for (int i = 0; i < b ;i++) {
			c += s.nextInt();
		}

		if(a < c) {
			System.out.println(-1);
		} else {
			System.out.println(a - c);
		}

	}

}
