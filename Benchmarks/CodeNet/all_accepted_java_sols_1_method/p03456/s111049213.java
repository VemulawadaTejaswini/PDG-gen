import java.util.Scanner;

/**
 * http://abc086.contest.atcoder.jp/tasks/abc086_b
 */
public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		sc.close();
		
		int num = Integer.parseInt(a+b);
		int sqrt = (int)Math.sqrt(num);
		String ans = num==sqrt*sqrt ? "Yes" : "No";
		System.out.println(ans);
		

	}

}