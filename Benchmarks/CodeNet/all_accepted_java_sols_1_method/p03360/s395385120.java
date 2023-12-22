import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int k = sc.nextInt();
		
		for (int i=0;i < k;i++) {
			if ((a >= b) && (a >= c)) {
				a = a*2;
			} else if ((b >= a) && (b >= c)) {
				b = b*2;
			} else {
				c = c*2;
			}
		}
		System.out.println(a+b+c);
	}
}