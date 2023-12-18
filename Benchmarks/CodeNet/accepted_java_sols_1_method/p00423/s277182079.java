import java.util.*;
public class Main {
	private static Scanner sc;
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		while(sc.hasNext()) {
			int n = sc.nextInt();
			if (n==0) break;
			int ansa = 0;
			int ansb = 0;
			for (int i=0; i<n; i++) {
				int a = sc.nextInt();
				int b = sc.nextInt();
				if (a>b) ansa += a+b;
				else if (b>a) ansb += a+b;
				else {
					ansa += a;
					ansb += b;
				}
			}
			System.out.println(ansa + " " + ansb);
		}
	}
}