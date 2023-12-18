
import java.util.Scanner;

public class Main {
	// AOJ2017 2問目
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String a, b;

		Star: while (true) {
			int count = 0, lena = 0, lenb = 0;
			a = s.next();
			if (a.equals(".")) {
				break;
			}
			b = s.next();
			// a=b
			if (a.equals(b)) {
				System.out.println("IDENTICAL");
				continue;
			} // それ以外
			else if (a.contains("\"") && b.contains("\"")) {
				String[] A = a.split("\"", -1);
				lena = A.length;
				String[] B = b.split("\"", -1);
				lenb = B.length;

				if (lena != lenb) {
					System.out.println("DIFFERENT");
					continue;
				}
				// aとbの"で囲まれた文字列を比較
				for (int i = 1; i < lena; i += 2) {
					if (!(A[i].equals(B[i]))) {
						count++;
					}
				}
				// aとbの"で囲まれていない文字列を比較
				for (int i = 0; i < lena; i += 2) {
					if (!(A[i].equals(B[i]))) {
						System.out.println("DIFFERENT");
						continue Star;
					}
				}
			}

			if (count == 1) {
				System.out.println("CLOSE");
			} else {
				System.out.println("DIFFERENT");
			}
		}
		s.close();
	}

}
