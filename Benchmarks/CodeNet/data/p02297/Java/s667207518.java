import java.util.*;
import java.io.*;
import java.lang.*;

public class Main {
	
	static int INF = 1000000000;
	static int MAXN = 31;
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int[][] point = new int[n][2];
		for (int i = 0; i < n; ++i) {
			point[i][0] = input.nextInt();
			point[i][1] = input.nextInt();
		}
		double res = 0;
		for (int i = 0; i < n - 1; ++i) {
			res += (point[i][0] - point[i + 1][0]) * (point[i][1] + point[i + 1][1]);
		}
		res += (point[n - 1][0] - point[0][0]) * (point[n - 1][1] + point[0][1]);
		res = Math.abs(res) / 2;
		System.out.printf("%.1f\n", res);
	}
}