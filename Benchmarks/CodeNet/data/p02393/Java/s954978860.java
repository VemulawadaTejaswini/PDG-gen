import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] nStr = new String[3];
		int[] n = new int[nStr.length];
		for (int i = 0; i < n.length; i++) {
			nStr[i] = sc.next();
			n[i] = Integer.parseInt(nStr[i]);
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
			System.out.println(n[i] + " ");
		}
		sc.close();
	}
}