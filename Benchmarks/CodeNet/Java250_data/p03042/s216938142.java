import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		String S = sc.next();

		String ans = "";

		int left = Integer.parseInt(S.substring(0,2));
		int right = Integer.parseInt(S.substring(2,4));


		if ((left>0&&left<13)&&(right>0&&right<13)) {
			ans = "AMBIGUOUS";
		} else if ((left==0 ||left>12) && (right<=12 && right>0)) {
			ans = "YYMM";
		} else if ((left<=12 && left>0) && (right==0 || right>12)) {
			ans = "MMYY";
		} else {
			ans = "NA";
		}
		System.out.println(ans);
	}

}
