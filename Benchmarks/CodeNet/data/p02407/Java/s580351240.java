

import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int after[] = new int[n];

		for (int i = n - 1; i > -1; i--) {
			after[i] = sc.nextInt();
		}
		String str = "";
		for (int k : after) {
			str=str+k+" ";
		}
		System.out.println(str.trim());
	}

}
