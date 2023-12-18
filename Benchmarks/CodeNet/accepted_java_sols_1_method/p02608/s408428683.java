import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		
		for(int n = 1; n <= a; n++) {
			int num = 0;
			int count = (int)(Math.sqrt(n)/Math.sqrt(6) + 1);
			final double log = Math.sqrt(n);
			for(int x = 1; x <= count; x++) {
				int yO = (int)(((n - x*x)/(2*x+3))+ 1);
				for(int y = x; y <= yO; y++) {
					int D = 2*(x + y) - 4*(x*x + y*y + x*y - n);
					if(D < 0) {
						break;
					}
					for(int z = y; z <= log; z++) {
						if(x*x + y*y + z*z + x*y + y*z + z*x == n) {
							if(x == y) {
								if(y == z) {
									num++;
								} else {
									num += 3;
								}
							} else if(y == z) {
								num += 3;
							} else if(z == x) {
								num += 3;
							} else {
								num += 6;
							}
						}
					}
				}
			}
			System.out.println(num);
		}
	}

}
