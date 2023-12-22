import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();

		String a[] = new String[1000];
		for (int i = 0; i < 1000; i++) {
			a[i] = String.format("%03d", i).toString();
		}

		String tmp;
		int count = 0;
		for (int i = 0; i < 1000; i++) {
			tmp = s;
			int first = tmp.indexOf(a[i].charAt(0));
			if (first == -1) continue;
			tmp = tmp.substring(first + 1);
			int second = tmp.indexOf(a[i].charAt(1));
			if (second == -1) continue;
			tmp = tmp.substring(second + 1);
			int third = tmp.indexOf(a[i].charAt(2));
			if (first != -1 && second != -1 && third != -1) {
				count++;
			}
		}

		System.out.println(count);
		sc.close();
	}
}