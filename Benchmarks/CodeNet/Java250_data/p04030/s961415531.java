import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String tempStr = "";
		String ansStr = "";
		for (int i = 0; i < s.length(); i++) {
			tempStr = s.substring(i, i + 1);
			if (tempStr.equals("0") | tempStr.equals("1")) {
				ansStr += tempStr;
			} else {
				if (ansStr.equals("")) {
					continue;
				} else {
					ansStr = ansStr.substring(0, ansStr.length() - 1);
				}
			}
		}
		System.out.println(ansStr);
	}
}