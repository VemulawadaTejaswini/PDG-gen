
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();

		int l = 1;
		int r = n;
		for (int i=0;i<m;i++) {
			l = Math.max(l, sc.nextInt());
			r = Math.min(r, sc.nextInt());
		}

		System.out.println(Math.max(r-l+1, 0));

	}




}
