

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();

		int[] res = new int[n];

		for(int i = 0; i < n; i++) {
			res[sc.nextInt() - 1]=i;
		}
		sc.close();

		StringBuilder sb = new StringBuilder();
		for(Integer r : res) {
			sb.append(" " + String.valueOf(r.intValue() + 1));
		}
		System.out.println(sb.toString().trim());
	}
}
