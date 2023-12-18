import java.util.Scanner;
public class Main {
		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			int n,x,y,b,p;
			n = scan.nextInt();
			for(int i = 0; i < n; i++) {
				x = scan.nextInt();
				y = scan.nextInt();
				b = scan.nextInt();
				p = scan.nextInt();
				int z = x * b + y * p;
				if(b > 4 && p >1 ) {
					System.out.println(z * 0.8);
				} else {
					int a = x * b + y * p;
					if(b > 4 && a > (x * b + y * 2) * 0.8) {
						System.out.println((x * b + y * 2) * 0.8);
					} else if(p > 1 && a > (x * 5 + y * p) * 0.8) {
						System.out.println((x * 5 + y * p) * 0.8);
					} else {
						System.out.println(a);
					}
				}
			}
		}
}