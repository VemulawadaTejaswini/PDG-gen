import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] grade = new String[50];
		int n = 0;
		while(true) {
			int m = scan.nextInt();
			int f = scan.nextInt();
			int r = scan.nextInt();
			if (m == -1 && f == -1 && r == -1) break;
			if ((m == -1 || f == -1) || (m + f < 30)) {
				grade[n] = "F";
			}
			else if (m + f >= 80) {
				grade[n] = "A";
			}
			else if (m + f < 80 && m + f >= 65) {
				grade[n] = "B";
			}
			else if (m + f < 65 && m + f >= 50) {
				grade[n] = "C";
			}
			else if (m + f < 50 && m + f >= 30) {
				if (r >= 50) {
					grade[n] = "C";
				}
				else {
					grade[n] = "D";
				}
			}
			n++;
		}
		for (int i = 0; i < n; i++) {
			System.out.println(grade[i]);
		}
	}

}
