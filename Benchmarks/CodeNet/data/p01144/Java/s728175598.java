import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			while(sc.hasNext()) {
				int n = sc.nextInt();
				int m = sc.nextInt();
				if(n + m == 0) break;
				
				int[] ds = new int[11];
				while(n-- != 0) {
					int d = sc.nextInt();
					int p = sc.nextInt();
					ds[p] += d;
				}
				int P = 0;
				for(int p=10; p>=0; p--) {
					if(m >= ds[p]) {
						m -= ds[p];
					}
					else {
						P += (ds[p] - m) * p;
						m = 0;
					}
				}
				System.out.println(P);
			}
		}
	}
}
