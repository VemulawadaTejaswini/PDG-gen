import java.util.*;
public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int k = sc.nextInt();
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		int i, c = 0;
		for(i = 1; i < k; i++) {
			int xi = sc.nextInt();
			int yi = sc.nextInt();
			if((x1 > xi && y1 < yi) || (x1 < xi && y1 > yi)) {
				c = c + Math.abs(x1 - xi) + Math.abs(y1 - yi);
				}
			else {
				c = c + Math.max(Math.abs(x1 - xi), Math.abs(y1 - yi));
				}
			x1 = xi;
			y1 = yi;
			}
		System.out.println(c);
		sc.close();
		}
	}