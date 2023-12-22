import java.util.*;
import java.util.stream.*;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] a = new int[n];
		int cnt = 0;
		for (int i = 0; i < n; i++) {
			a[i] = in.nextInt();
		}
		for (int i = 1; i < n; i++) {
			if(a[i - 1] == a[i]) {
				cnt++;
				a[i] = Integer.MAX_VALUE;
			}
		}
		System.out.println(cnt);
	}

}