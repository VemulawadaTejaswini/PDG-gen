import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		int a[] = new int[2];
		for (int i=0;i<S.length();i++) {
			a[S.charAt(i)-'0']++;
		}
		if (a[0]>a[1]) {
			System.out.println(a[1]*2);
		} else {
			System.out.println(a[0]*2);
		}
	}
}