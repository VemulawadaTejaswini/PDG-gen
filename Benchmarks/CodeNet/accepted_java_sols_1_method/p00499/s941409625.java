import java.util.*;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner (System.in);
		
		int l = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		
		int jday, mday, result;
		
		if (a % c == 0) {
			jday = a / c;
		} else {
			jday = (a / c) + 1;
		}
		
		if (b % d == 0) {
			mday = b / d;
		} else {
			mday = (b / d) + 1;
		}
		
		if (jday > mday) {
			result = l - jday;
		} else {
			result = l - mday;
		}
		
		System.out.println(result);
		
	}

}