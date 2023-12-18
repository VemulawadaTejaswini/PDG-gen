import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] a = new int[2*n];
		for(int i = 0; i < 2*n; i++) a[i] = s.nextInt();
		Arrays.sort(a);;
		long ans = 0;
		for(int i = 0; i < 2*n; i+=2) {
			ans += Math.min(a[i], a[i+1]);
		}
		System.out.println(ans);
	}
}
