import java.util.*;
 
public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt(); int m = sc.nextInt(); int s = 0;
		int[] a = new int[m];
		while (m-- > 0) {
			a[m] = sc.nextInt();
			s+=a[m];
		}
			int v = n-s;
			System.out.println(v >= 0 ? v : "-1");
	}
}