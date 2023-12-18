import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int d = sc.nextInt();
		int cnt = 25 - d;
		StringBuilder ans = new StringBuilder("Christmas");
		for (int i = 0; i < cnt; i++) {
			ans.append(" Eve");
		}
		System.out.println(ans);
	}
}