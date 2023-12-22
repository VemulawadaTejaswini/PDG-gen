import java.util.Scanner;

/**
 * http://abc071.contest.atcoder.jp/tasks/abc071_a
 */
public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		
		System.out.println(Math.abs(x-a)<Math.abs(x-b) ? "A" : "B" ); 

	}

}
