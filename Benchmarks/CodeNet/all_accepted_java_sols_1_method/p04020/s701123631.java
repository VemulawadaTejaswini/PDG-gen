import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		long ans = 0;
		for(int i = 0; i < n; i++) {
			ans += a[i]/2;
			a[i] %= 2;
			if(i != (n-1) && a[i] > 0 && a[i+1] > 0) {
				ans++;
				a[i]--;
				a[i+1]--;
			}
		}
		System.out.println(ans);
	}
}
