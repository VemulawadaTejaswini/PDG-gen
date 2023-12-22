import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int a[];
		
		a = new int[10];
		while (sc.hasNext()) {
			String st = sc.next();
			for (int i = 1; i <= 9; i++) {
				a[i] = st.charAt(i - 1);
			}
			if (a[1] == a[2] && a[2] == a[3] && a[1] != 's') {
				System.out.println((char)(a[1]));
			} else if (a[4] == a[5] && a[5] == a[6] && a[4] != 's') {
				System.out.println((char)(a[4]));
			} else if (a[7] == a[8] && a[8] == a[9] && a[7] != 's') {
				System.out.println((char)(a[7]));
			} else if (a[1] == a[4] && a[4] == a[7] && a[1] != 's') {
				System.out.println((char)(a[1]));
			} else if (a[2] == a[5] && a[5] == a[8] && a[2] != 's') {
				System.out.println((char)(a[2]));
			} else if (a[3] == a[6] && a[6] == a[9] && a[3] != 's') {
				System.out.println((char)(a[3]));
			} else if (a[1] == a[5] && a[5] == a[9] && a[1] != 's') {
				System.out.println((char)(a[1]));
			} else if (a[3] == a[5] && a[5] == a[7] && a[3] != 's') {
				System.out.println((char)(a[3]));
			} else {
				System.out.println("d");
			}
		}
	}
}