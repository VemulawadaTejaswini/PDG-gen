import java.util.Scanner;

class calc {

	int ans = 1;

	void func(int n) {
		for (int i = 0; i < 3; i++) {
			ans *= n;
		}
		System.out.println(ans);
	}

}

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		calc cl = new calc();

		int n = sc.nextInt();

		cl.func(n);

	}

}