import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] n = new int[3];
		for (int i = 0; i < n.length; i++) {
			n[i] = Integer.parseInt(sc.next());
		}

		int flg = 1;
		while (flg == 1) {
			flg = 0;
			for (int i = 0; i < n.length - 1; i++) {
				if(n[i] > n[i +1]) {
					int tmp = n[i];
					n[i] = n[i + 1];
					n[i + 1] = tmp;
					flg = 1;
				}
			}
		}

		for (int i = 0; i < n.length; i++) {
			System.out.print(n[i]);
			if (i < n.length - 1) {
				System.out.print(" ");
			}
		}
		System.out.println();
		sc.close();
	}
}