import java.util.Scanner;

/**
 * https://abc074.contest.atcoder.jp/tasks/abc074_a
 */
public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A = sc.nextInt();
		sc.close();
		
		System.out.println(N*N-A);

	}

}