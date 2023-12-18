import java.util.Scanner;

/**
 * https://beta.atcoder.jp/contests/abc077/tasks/arc084_b
 */
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		sc.close();
		
		int a = Integer.parseInt(S.substring(0,2));
		int b = Integer.parseInt(S.substring(2,4));
		
		String ans = "NA";
		if(a>0 && a<=12 && b>0 && b<=12) {
			ans = "AMBIGUOUS";
		}else if(a>0 && a<=12){
			ans = "MMYY";
		}else if(b>0 && b<=12) {
			ans = "YYMM";
		}
		
		System.out.println(ans);
	}

}