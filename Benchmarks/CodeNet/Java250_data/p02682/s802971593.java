import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		int a = kb.nextInt();
		int b = kb.nextInt();
		int c = kb.nextInt();
		int k = kb.nextInt();
		int count = 0;
		if (k <= a) {
			count += k;
		} else {
			count += a;
			k -= a;
			if (k <= b) {
			} else {
				k -= b;
				if (k <= c) {
					count -= k;
				} else {
					count -= c;
					k -= c;
				}
			}
		}

		System.out.println(count);
		kb.close();
	}
}
