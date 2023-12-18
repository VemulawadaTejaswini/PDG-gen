import java.util.Scanner;

/**
 * https://abc057.contest.atcoder.jp/tasks/abc057_a
 */
public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		sc.close();
 
		System.out.println((A+B)%24);
		

	}

}
