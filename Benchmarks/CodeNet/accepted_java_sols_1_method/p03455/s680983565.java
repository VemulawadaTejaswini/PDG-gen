import java.util.Scanner;

/**
 * http://abc086.contest.atcoder.jp/tasks/abc086_a
 */
public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		
		System.out.println(a*b%2==1 ? "Odd" : "Even");

	}

}
