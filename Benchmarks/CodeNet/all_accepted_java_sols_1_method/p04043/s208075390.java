//Problem A
import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count5 = 0;
		int count7 = 0;
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if (a == 5) {
			count5++;
		}
		if (a == 7) {
			count7++;
		}
		if (b == 5) {
			count5++;
		}
		if (b == 7) {
			count7++;
		}
		if (c == 5) {
			count5++;
		}
		if (c == 7) {
			count7++;
		}
		if (count5 == 2 && count7 == 1) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}
