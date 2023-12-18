import java.util.*;
import java.io.*;
import java.math.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int n = sc.nextInt();
			int h = sc.nextInt();
			if(n == 0 && h == 0) break;
			boolean[][][] check = new boolean[n][n][n];
			int count = 0;
			for (int i = 0; i < h; i++) {
				String c = sc.next();
				int a = sc.nextInt()-1;
				int b = sc.nextInt()-1;

				if (c.equals("xy")) {
					for (int j = 0; j < n; j++) {
						if (check[a][b][j])
							continue;
						check[a][b][j] = true;
						count++;
					}
				} else if (c.equals("xz")) {
					for (int j = 0; j < n; j++) {
						if (check[a][j][b])
							continue;
						check[a][j][b] = true;
						count++;
					}
				} else {
					for (int j = 0; j < n; j++) {
						if (check[j][a][b])
							continue;
						check[j][a][b] = true;
						count++;
					}
				}

			}
			System.out.println(n * n * n - count);
		}
		
		
		
		
	}
}