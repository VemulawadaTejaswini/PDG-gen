import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] a = new long[n];
		long total = 1;
		boolean boo = true;
		for(int i = 0 ; i < n; i++) {
			a[i] = sc.nextLong();
			if(a[i] == 0) {
				boo = false;
				total = 0;
			}
		}
		
		long s = (long)Math.pow(10, 18);
		if(boo) {
			for(int i = 0; i < n; i++) {
				total *= a[i];
				if(total > s) {
					total = -1;
					break;
				}
			}
		}
		System.out.println(total);
	}
}
