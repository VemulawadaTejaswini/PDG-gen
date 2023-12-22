import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int l = sc.nextInt(); // 使用しない

		String[] s = new String[n];
		for (int i = 0; i < s.length; i++) {
			s[i] = sc.next();
		}
		sc.close();

//		int imin;
//		for (int i = 0; i < s.length - 1; i++) {
//			imin = i;
//			for (int j = i + 1; j < s.length; j++) {
//				if (s[imin].compareTo(s[j]) > 0) {
//					imin = j;
//				}
//			}
//			if (imin != i) {
//				exchange(s, imin, i);
//			}
//		}

		Arrays.sort(s);

		String sum = "";
		for (String str : s) {
			sum += str;
		}

		System.out.println(sum);
	}

//	public static void exchange(String[] s, int a, int b) {
//		String str = s[a];
//		s[a] = s[b];
//		s[b] = str;
//	}

}
