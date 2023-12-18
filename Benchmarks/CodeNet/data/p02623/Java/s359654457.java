
import java.util.*;

public class Main {

	public static void main(String[] args) {

		// 入力
		Scanner sc = new Scanner(System.in);
		int n = new Integer(Integer.parseInt(sc.next())); // 机Aの冊数
		int m = new Integer(Integer.parseInt(sc.next())); // 机Bの冊数
		long k = new Integer(Integer.parseInt(sc.next())); // 読書時間
		long a[] = new long[n];
		for (int i = 0; i < n; i++) {
			a[i] = new Integer(Integer.parseInt(sc.next()));
		}
		long b[] = new long[m];
		for (int i = 0; i < m; i++) {
			b[i] = new Integer(Integer.parseInt(sc.next()));
		}

		int i = 0;
		int j = 0;
		while (k >= 0) {

			if (i == n && j != m) {
				
				// Aの机が空
				k -= b[j];
				j++;

			} else if (i != n && j == m) {

				// Bの机が空
				k -= a[i];
				i++;
				
			} else if (i == n && j == m) {
				
				// もう本がない
				i++;
				break;
				
			} else {
				
				if (a[i] < b[j]) {
					
					// Aの机の本を読んで捨てる
					k -= a[i];
					i++;
					
				} else {
					
					// Bの机の本を読んで捨てる
					k -= b[j];
					j++;
					
				}

			}

			//System.out.println(i + " " + j + " " + k);

		}

		System.out.println(i + j - 1);

	}
}