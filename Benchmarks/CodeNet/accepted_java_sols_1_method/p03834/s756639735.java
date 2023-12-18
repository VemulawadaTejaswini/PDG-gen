import java.util.Scanner;

/**
 * https://abc051.contest.atcoder.jp/tasks/abc051_a
 */
public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		sc.close();
		
		System.out.println(s.replaceAll(","," "));

	}

}