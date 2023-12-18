import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int a;
		String st;
		int sum;
		boolean flag;

		while (sc.hasNext()) {
			a = sc.nextInt();
			st = Integer.toBinaryString(a);
			sum = 1;
			flag = true;;

			for (int i = st.length() - 1; 0 <= i; i--) {
				if (st.charAt(i) == '1') {
					if (flag) {
						System.out.print(sum);
						flag = false;
					} else {
						System.out.print(" " + sum);
					}
				}
				sum *= 2;
			}
			System.out.println();
		}
	}
}