

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int H = scan.nextInt();
		int W = scan.nextInt();
		String[] str = new String[H + 2];
		String tmp = "";
		for(int i = 0; i < W + 2; i++) {
			tmp += "#";
		}
		str[0] = tmp;
		str[str.length - 1] = tmp;
		for(int i = 1; i <= H; i++) {
			str[i] = "#" + scan.next() + "#";
		}
		for(int i = 0; i < str.length; i++) {
			System.out.println(str[i]);
		}
		scan.close();

	}

}
