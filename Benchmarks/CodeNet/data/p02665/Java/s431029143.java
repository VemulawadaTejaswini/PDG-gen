import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] a = new long[n + 1];
		long[] b = new long[n + 1];
		long[] c = new long[n + 1];
		long d = 0L;
		for(int i = 0 ; i < n + 1 ; i++) {
			a[i] = sc.nextLong();
			if(i == 0 && a[i] != 0L) {
				System.out.println(-1);
				return;
			}
		}
		for(int i = n ; i >= 0 ; i--) {
			if(i == n)
				b[i] = a[i];
			else {
				b[i] = b[i + 1] + a[i];
              
			}

		}
		for(int i = 0 ; i < n + 1 ; i++) {
			if(i == 0)
			c[i] = 1L;
			else {
				c[i] = (c[i - 1] - a[i - 1]) * 2L ;
              if(c[i - 1] < a[i]){
				System.out.println(-1);
				return;
			}
				if(i != n) {
					if(c[i] - a[i] > b[i + 1]) {
					c[i] = b[i + 1] + a[i];
					}
				}
				else if(i == n) {                  
                   c[i] = a[i];

				}
			}
			d += c[i];

		}

			System.out.println(d);


	}

}
