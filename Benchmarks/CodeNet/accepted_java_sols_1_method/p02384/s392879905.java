
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		//.splitで文字列を区切る
		String[] line = sc.nextLine().split(" ");

		//int型にして格納していく
		int a1 = Integer.parseInt(line[0]);
		int a2 = Integer.parseInt(line[1]);
		int a3 = Integer.parseInt(line[2]);
		int a4 = Integer.parseInt(line[3]);
		int a5 = Integer.parseInt(line[4]);
		int a6 = Integer.parseInt(line[5]);

		int b = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < b; i++) {

			int ue = sc.nextInt();
			int mae = sc.nextInt();
			int ans = 0;

			if (ue == a1 || ue == a6) {
				if (mae == a2) {
					ans = 3;
				} else if (mae == a3) {
					ans = 5;
				} else if (mae == a4) {
					ans = 2;
				} else {
					ans = 4;
				}
			}

			if (ue == a2 || ue == a5) {
				if (mae == a1) {
					ans = 4;
				} else if (mae == a3) {
					ans = 1;
				} else if (mae == a4) {
					ans = 6;
				} else {
					ans = 3;
				}
			}

			if (ue == a3 || ue == a4) {
				if (mae == a1) {
					ans = 2;
				} else if (mae == a2) {
					ans = 6;
				} else if (mae == a5) {
					ans = 1;
				} else {
					ans = 5;
				}
			}

			if (ue == a4 || ue == a5 || ue == a6) {
				ans = 7 - ans;
			}
			System.out.println(line[ans - 1]);
		}
	}
}
