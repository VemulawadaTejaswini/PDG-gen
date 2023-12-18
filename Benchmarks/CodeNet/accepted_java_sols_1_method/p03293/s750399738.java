import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String t = sc.next();
		// Sを1回転させる。Tと一致したらYesしてbreak
		String result = "No";
		String s_turned = s;
		for (int i = 0; i < s.length(); i++) {
			char c1 = s_turned.charAt(0);
			String s_temp = s_turned.substring(1);
			s_turned = s_temp + c1;
			if (s_turned.equals(t)) {
				result = "Yes";
				break;
			}
		}
		System.out.println(result);
	}
}