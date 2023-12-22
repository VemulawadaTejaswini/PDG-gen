import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int temp;
		int ans = 1;
		for (int i = 2; i * i <= X; i++) {
			temp = i;
			while (temp * i <= X) {
				temp *= i;
			}
			if (temp > ans) {
				ans = temp;
			}
		}
		System.out.println(ans);
	}
}
