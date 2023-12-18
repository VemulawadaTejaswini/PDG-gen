import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n,x,y,b,p,z;
		n = scan.nextInt();
		for(int i = 0; i < n; i++) {
			x = scan.nextInt();
			y = scan.nextInt();
			b = scan.nextInt();
			p = scan.nextInt();
			if(b >= 5 && p >= 2) {
				z = x * b * 8 + y * p * 8;
				System.out.println(z / 10);
			} else if(b >= 5 && p < 2) {
				z = x * b + y * p;
				p = 2;
				System.out.println((x * b * 8+ y * p * 8) / 10);
			} else if(b < 2 && p >= 5) {
				z = x * b + y * p;
				b = 2;
				System.out.println((x * b * 8+ y * p * 8) / 10);
			} else {
				z = x * b + y * p;
				System.out.println(z);
			}
		}
	}
}