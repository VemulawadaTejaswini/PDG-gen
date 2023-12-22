import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[] = new int[3];
		int b[] = new int[3];
		int c[] = new int[5];
		for (int i=0;i<3;i++) {
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
			c[a[i]]++;
			c[b[i]]++;
		}
		int one =0;
		int two =0;
		for (int i=1;i<5;i++) {
			if (c[i]==1) {
				one ++;
			} else if (c[i]==2) {
				two++;
			}
		}
		if (one==2&&two==2) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}