import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		String b = "APPROVED";
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			int j = kb.nextInt();
			a[i] = j;
		}
		for (int e : a) {
			if (e % 2 == 0) {
				if (e % 3 != 0 && e % 5 != 0) {
					b = "DENIED";
					break;
				}
			}
		}
		System.out.println(b);

		kb.close();
	}

}
