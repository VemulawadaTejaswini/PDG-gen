import java.util.Scanner;

/**
 * https://abc050.contest.atcoder.jp/tasks/abc050_a
 */
public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		String op = sc.next();
		int b = sc.nextInt();
		sc.close();
		
		int ans = op.equals("+") ? a+b : a-b;
		
		System.out.println(ans);

	}

}