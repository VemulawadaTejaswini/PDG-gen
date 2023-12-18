import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		Arrays.fill(a, -1);
		int len = 0;
		for (int i = 0; i < n; i++) {
			int b = sc.nextInt();
			int r = len;
			int l = -1;
			while(r-l>1) {
				int mid =(r+l)/2;
				if(a[mid] < b) r = mid;
				else l = mid;
			}
			a[r] = b;
			if(r == len) len++;
		}

		System.out.println(len);
		sc.close();
	}
}