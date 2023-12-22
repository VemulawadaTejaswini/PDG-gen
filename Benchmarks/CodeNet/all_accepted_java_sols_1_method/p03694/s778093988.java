import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int l = 1001;
		int r = -1;
		for (int i = 0; i < n; i++) {
			int a = sc.nextInt();
			l = Math.min(l, a);
			r = Math.max(r, a);
		}
		
		System.out.println(r - l);
		sc.close();
	}
}


