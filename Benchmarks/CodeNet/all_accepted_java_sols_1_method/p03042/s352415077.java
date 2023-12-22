
import java.text.SimpleDateFormat;

public class Main {
	public static void main(String args[]) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		String S = sc.next();

		boolean isYYMM = true;
		boolean isMMYY = true;

		try {
			// 日付チェック
			SimpleDateFormat sdf = new SimpleDateFormat("yyMM");
			sdf.setLenient(false);
			sdf.parse(S);

		} catch (Exception ex) {
			isYYMM = false;
		}

		try {
			// 日付チェック
			SimpleDateFormat sdf = new SimpleDateFormat("MMyy");
			sdf.setLenient(false);
			sdf.parse(S);

		} catch (Exception ex) {
			isMMYY = false;
		}

		if (isMMYY && isYYMM) {
			System.out.println("AMBIGUOUS");
		} else if (isMMYY && !isYYMM) {
			System.out.println("MMYY");
		} else if (!isMMYY && isYYMM) {
			System.out.println("YYMM");
		} else {
			System.out.println("NA");
		}

	}
}