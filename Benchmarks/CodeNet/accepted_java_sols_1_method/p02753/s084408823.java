import java.util.Scanner;

/**
 *
 * https://atcoder.jp/contests/abc158/tasks/abc158_a
 *
 * @author shouma
 *
 */

public class Main {
	public static void main(String args[]) {
		//strにはAかBの文字列が入る。(３文字)
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		//AAAのみやBBBのみだと、バスは運行しない→Noを出力
			if(str.contains("AAA") || str.contains("BBB")){
				System.out.println("No");
			}else {
				System.out.println("Yes");
			}
        scan.close();
	}
}