import java.util.Scanner;
public class Main {
private static Scanner s = new Scanner(System.in);

public static void main(String[] args) {
	int n = s.nextInt();
	int[][] a = new int[n][n];
	StringBuilder sb = new StringBuilder();

	for(int i = 0;i < n;i++) {
		int ap = s.nextInt();
	int k = s.nextInt();
	for(int j = 1;j <= k;j++) {
		int u = s.nextInt();
		if(u <= n && u > 0) {
		a[i][u-1]++;
	}
	}
	}
	for(int i = 0;i < n;i++) {
		for(int j = 0;j < n;j++) {
			if(j == n-1) {
				sb.append(a[i][j] + "\n");
			}else {
				sb.append(a[i][j] + " ");
			}
		}
	}
	System.out.print(sb);
	}
}

