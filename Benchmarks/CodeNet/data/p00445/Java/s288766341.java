import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String st;
		int ioiCount, joiCount;
		
		st = sc.next();
		while (st != "\n") {
			ioiCount = 0;
			joiCount = 0;
			for (int i = 0; i < st.length() - 2; i++) {
				if (st.charAt(i) == 'I' && st.charAt(i + 1) == 'O' && st.charAt(i + 2) == 'I') {
					ioiCount++;
				} else if (st.charAt(i) == 'J' && st.charAt(i + 1) == 'O' && st.charAt(i + 2) == 'I') {
					joiCount++;
				}
			}
			System.out.println(joiCount);
			System.out.println(ioiCount);
			st = sc.next();
		}
	}
}