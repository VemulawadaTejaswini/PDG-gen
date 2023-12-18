import java.util.Scanner;

/**
 * https://abc058.contest.atcoder.jp/tasks/abc058_a
 */
public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		sc.close();
		
		String ans = b-a == c-b ? "YES" : "NO";
 
		System.out.println(ans);
		

	}

}