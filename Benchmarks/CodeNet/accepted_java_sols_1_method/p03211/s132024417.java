import java.util.*;

public class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = sc.nextLine();
		int res = 999;
		for (int i = 0; i + 2 < str.length(); i++) {
			int a = str.charAt(i) - '0';
			int b = str.charAt(i + 1) - '0';
			int c = str.charAt(i + 2) - '0';
			res = Math.min(res, Math.abs(a * 100 + b * 10 + c - 753));

		}
		System.out.println(res);

	}

}
