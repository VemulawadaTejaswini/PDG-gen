

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		long d = scan.nextInt();
		int count = 0;
		for(int i = 0; i < n; i++) {
			long x = scan.nextLong();
			long y = scan.nextLong();
			long xx;
			long yy;
			xx = (long)Math.pow(x,2);
			yy = (long)Math.pow(y,2);

			if(d>=Math.sqrt(xx+yy)) {
				count = count + 1;
			}
		}
		System.out.println(count);
	}

}
