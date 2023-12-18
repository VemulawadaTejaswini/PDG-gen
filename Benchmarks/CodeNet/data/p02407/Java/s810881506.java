import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		Scanner sc = new Scanner(System.in);

		String line1 = sc.nextLine();
		int n = Integer.parseInt(line1);

		String line2 = sc.nextLine();
		String[] s = line2.split(" ");

		int[] a = new int[s.length];
		for (int i = 0; i < s.length; i++) {
			a[i] = Integer.parseInt(s[i]);
		}

		StringBuilder str = new StringBuilder();

		while (n > 0) {
			str.append(a[n - 1]);
			if (n == 1) {
				break;
			}
			str.append(" ");
			n--;
		}

		System.out.println(str);
	}

}