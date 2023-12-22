

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		String s = sc.next();
		StringBuilder sb = new StringBuilder();
		if(s.length() > k) {
			sb.append(s.substring(0, k));
			sb.append("...");
			System.out.println(sb);
		} else {
			System.out.println(s);
		}

	}

}
