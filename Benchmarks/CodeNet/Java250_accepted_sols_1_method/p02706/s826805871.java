import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner kbs = new Scanner(System.in);
		int n,m;
		n = kbs.nextInt();
		m = kbs.nextInt();
		int s = 0;
		for(int i = 0;i < m;i++) {
			int x = kbs.nextInt();
			s = s + x;
		}
		n = n - s;
		if (n < 0) {
			n = -1;
		}
		System.out.printf("%d", n);
		kbs.close();
	}
}
