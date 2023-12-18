import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		String s = sc.next();
		int a = Integer.parseInt(s.substring(0, 2));
		int b = Integer.parseInt(s.substring(2, 4));
		if (a <= 12 && b <= 12 && a > 0 && b > 0) {
			sb.append("AMBIGUOUS");
		} else if (a <= 12 && a > 0) {
			sb.append("MMYY");
		} else if (b <= 12 && b > 0) {
			sb.append("YYMM");
		} else {
			sb.append("NA");
		}
		System.out.println(sb);
	}
}
