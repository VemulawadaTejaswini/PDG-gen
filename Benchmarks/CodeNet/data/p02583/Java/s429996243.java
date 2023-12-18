import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		Arrays.sort(a);
		int ans = 0;
		for(int i = 0; i < n; i++) {
			for(int j = i+1; j < n; j++) {
				for(int k = j+1; k < n; k++) {
					ans += (check(a[i], a[j], a[k]) && a[i] != a[j] && a[j] != a[k] && a[i] != a[k] ? 1 : 0);
				}
			}
		}
		System.out.println(ans);
	}
	
	public static boolean check(int a, int b, int c) {
		if(c > Math.abs(a-b) && c < Math.abs(a+b) && b > Math.abs(a-c) && b < Math.abs(a+c) && a > Math.abs(b-c) && a < Math.abs(b+c)) {
			return true;
		}
		return false;
	}
}
