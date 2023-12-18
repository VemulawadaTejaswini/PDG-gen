import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		String ans = "";
		while (N != 0) {
			if (N % 2 != 0) {
				N--;
				ans = "1" + ans;
			} else {
				ans = "0" + ans;
			}
			N /= -2;
		}
		if (ans == "") {
			ans = "0";
		}
		System.out.println(ans);
		sc.close();
	}
}
