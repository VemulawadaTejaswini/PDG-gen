	
	import java.util.Scanner;
		 
		public class Main {
			
			public static void main(String[] args) {
				
				Scanner sc = new Scanner(System.in);
				long n = sc.nextLong();
				long m = sc.nextLong();
				long x = 1000000000+7;
				
				long kai = 1;
				long amari = 0;
				for(int i = 1; i <= n; i++) {
					kai *= i;
					if(kai > x) {
						kai = kai % x;
					}
				}
				for(int i = 1; i <= m; i++) {
					kai *= i;
					if(kai > x) {
						kai = kai % x;
					}
				}
				
				if(Math.max(n, m) - Math.min(n, m) > 1) {
					System.out.println(0);
				} else if(n == m) {
					System.out.println(kai * 2 % x);
				} else {
					System.out.println(kai % x);
				}
			}
		}