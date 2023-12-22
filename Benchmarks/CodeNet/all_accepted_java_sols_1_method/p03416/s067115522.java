import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);

		int a = scan.nextInt();
		int b = scan.nextInt();

		int ans = 0;
		for (int i = a; i <= b; i++) {
			String temp1 = String.valueOf(i).substring(0, 1);
			String temp2 = String.valueOf(i).substring(1, 2);
//			String temp3 = String.valueOf(i).substring(2, 3);
			String temp4 = String.valueOf(i).substring(3, 4);
			String temp5 = String.valueOf(i).substring(4, 5);

			if ( temp1.equals(temp5) && temp2.equals(temp4)) {
				ans ++;
			}
		}

		System.out.println(ans);

	}
}