import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String n = sc.next();
		String s[] = new String[N];
		int a[] = new int[N];

		for (int i = 0; i < N; i++) {
			s[i] = n.substring(i, i+1);
		}

		for (int i = 0; i < N; i++) {
			if (i == 0) {
				//東に向いている人の数を数える
				for (int j = 1; j < N; j++) {
					if (s[j].equals("E")) {
						a[i]++;
					}
				}
			} else {
				//自分より右にいる人で西を向いている人は方向を変える必要がある
				if (s[i-1].equals("W")) {
					a[i] = a[i-1] + 1;
				} else {
					a[i] = a[i-1];
				}
				//自分が東を向いている場合は自分の分を抜く
				if (s[i].equals("E")) {
					a[i]--;
				}
			}
		}
		Arrays.sort(a);
		System.out.println(a[0]);
	}
}
