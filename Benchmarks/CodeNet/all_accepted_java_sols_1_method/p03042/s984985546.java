import java.util.Scanner;

//AtCoder Beginner Contest 126
//B	YYMM or MMYY
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.nextLine();

		sc.close();

		int a = Integer.valueOf(S.substring(0, 2)).intValue();
		int b = Integer.valueOf(S.substring(2)).intValue();

		boolean aIsMonth = (a > 0 && a < 13);
		boolean bIsMonth = (b > 0 && b < 13);

		String ans = "NA";
		if (aIsMonth) {
			if (bIsMonth) {
				ans = "AMBIGUOUS";
			} else {
				ans = "MMYY";
			}
		} else {
			if (bIsMonth) {
				ans = "YYMM";
			}
		}

		System.out.print(ans);
	}
}
