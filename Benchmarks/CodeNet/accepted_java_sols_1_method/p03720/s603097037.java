
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] a = new int[n];
		int x;
		for(int i = 0; i < m*2; i++) {
			x = sc.nextInt();
			a[x-1]++;
		}
		for(int i = 0; i < n; i++) {
			System.out.println(a[i]);
		}
	}
}
