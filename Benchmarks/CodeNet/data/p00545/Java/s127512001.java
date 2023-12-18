import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		long t = sc.nextLong();
		int q = sc.nextInt();
		
		long[] a = new long[n];
		boolean[] d = new boolean[n];
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextLong();
			d[i] = (sc.nextInt() == 1);
		}
		
		for(int i = 0; i < q; i++) {
			int x = sc.nextInt() - 1;
			if(d[x]) {
				int y = -1;
				for(int j = x + 1; j < n; j++) {
					if(!d[j]) {
						y = j;
						break;
					}
				}
				
				if(y == -1) {
					System.out.println(a[x] + t);
				}else {
					int z = -1;
					if(y - x > 1) {
						z = y - 1;
					}
					
					if(z == -1) {
						if(t * 2 <= a[y] - a[x]) {
							System.out.println(a[x] + t);
						}else {
							System.out.println((a[x] + a[y]) / 2);
						}
					}else {
						if(t * 2 <= a[y] - a[z]) {
							System.out.println(a[x] + t);
						}else {
							long p = (a[y] + a[z]) / 2;
							if(t <= p - a[x] || p - a[x] <= (a[y] - a[z]) / 2) {
								System.out.println(a[x] + t);
							}else {
								System.out.println(p);
							}
						}
					}
				}
			}else {
				int y = -1;
				for(int j = x - 1; j >= 0; j--) {
					if(d[j]) {
						y = j;
						break;
					}
				}
				
				if(y == -1) {
					System.out.println(a[x] - t);
				}else {
					int z = -1;
					if(x - y > 1) {
						z = y + 1;
					}
					
					if(z == -1) {
						if(t * 2 <= a[x] - a[y]) {
							System.out.println(a[x] - t);
						}else {
							System.out.println((a[x] + a[y]) / 2);
						}
					}else {
						if(t * 2 <= a[z] - a[y]) {
							System.out.println(a[x] - t);
						}else {
							long p = (a[y] + a[z]) / 2;
							if(t <= a[x] - p || a[x] - p <= (a[z] - a[y]) / 2) {
								System.out.println(a[x] - t);
							}else {
								System.out.println(p);
							}
						}
					}
				}
			}
		}
	}
}
