import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int y = scn.nextInt();
		boolean flg = false;
		//		int cnt1=0;
		//		int cnt5=0;
		//		int cnt10=0;
		if (y % 1000 == 0) {
			for (int i = 0; i <= n && flg==false; i++) {
				for (int j = 0; j <= n - i; j++) {
					if (i * 10 + j * 5 + (n - i - j) == y / 1000) {
						flg = true;
						System.out.println(i + " " + j + " " + (n - i - j));
						break;
					}
				}
			}
		}
		if (flg == false) {
			System.out.println("-1 -1 -1");
		}
	}

}
