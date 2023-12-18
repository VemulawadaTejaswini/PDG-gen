import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int total = sc.nextInt();
		for(int i = 0;i <=n;i++) {
			int otoshidama = 10000 * i;
			for(int j = 0; j <= n -i;j++) {
				otoshidama += ((5000 * j) + (1000 * (n-i-j)));
				if(otoshidama == total) {
					System.out.println(i + " " + j + " " + (n -i -j) );
					return;
				}else {
					otoshidama = 10000 * i;
				}
			}
		}
		System.out.println("-1 -1 -1");
	}
}