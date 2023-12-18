

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long n = sc.nextLong();

		char[] a = new char[26];
		String s = "abcdefghijklmnopqrstuvwxyz";
		int count = 0;
		for (char c : s.toCharArray()) {
			a[count] = c;
			count++;
		}

		ArrayList<Integer> arr = new ArrayList<Integer>();
		while (n > 0) {
			arr.add(Integer.parseInt("" + n % 26));
			n /= 26;
		}

		String ans = "";
		for (int i = arr.size() - 1; i >= 0; i--) {
			ans += a[arr.get(i) - 1];
		}

		System.out.println(ans);
	}

}
