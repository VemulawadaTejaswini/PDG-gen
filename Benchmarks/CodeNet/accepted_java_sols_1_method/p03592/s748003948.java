import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(f.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		boolean good = false;
		for(int i = 0; i <= n; i++) {
			for(int j = 0; j <= m; j++) {
				if(i*(m - j) + j*(n - i) == k) {
					good = true;
				}
			}
		} 
		if(good) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
