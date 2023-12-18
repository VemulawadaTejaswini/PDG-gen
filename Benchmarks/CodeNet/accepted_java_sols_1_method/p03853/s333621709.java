import java.util.Scanner;

/**
 * https://abc049.contest.atcoder.jp/tasks/abc049_b
 */
public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		sc.nextInt();
		String[] s = new String[H];
		for(int i=0; i<H; i++) s[i] = sc.next();
		sc.close();
		
		for(int i=0; i<H; i++){
			System.out.println(s[i]);
			System.out.println(s[i]);
		}

	}

}
