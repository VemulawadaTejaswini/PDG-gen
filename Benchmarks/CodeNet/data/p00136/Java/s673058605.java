import java.util.Scanner;

public class Main{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n;
		String str[] = new String[6];
		
		str[0] = "";
		str[1] = "";
		str[2] = "";
		str[3] = "";
		str[4] = "";
		str[5] = "";
		n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			double a = sc.nextDouble();
			if (a < 165.0) {
				str[0] += "*";
			} else if (a < 170.0) {
				str[1] += "*";
			} else if (a < 175.0) {
				str[2] += "*";
			} else if (a < 180.0) {
				str[3] += "*";
			} else if (a < 185.0) {
				str[4] += "*";
			} else {
				str[5] += "*";
			}
		}
		
		for (int i = 0; i < 6; i++) {
			System.out.println((i + 1) + ":" + str[i]);
		}
	}
}