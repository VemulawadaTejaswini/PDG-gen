import java.util.Scanner;
public class Main {
private static Scanner s = new Scanner(System.in);

public static void main(String[] args) {
	int n = s.nextInt();
	int[][] T = new int[n][n];
	int ans = 0;
	int min,mint = 0,count = 1;
	int[] times = new int[n];

	for(int i = 0;i < n;i++) {
		for(int j = 0;j < n;j++) {
			T[i][j] = s.nextInt();
		}
	}
	times[0] = 1;
	while(true) {
		min = Integer.MAX_VALUE;

		for(int i = 0;i < n;i++) {
			if(times[i] == 1) {
			for(int j = 0;j < n;j++) {
				if(times[j] == 0 && T[i][j] >= 0 && T[i][j] < min) {
					min = T[i][j];
					mint = j;
				}
			}
			}
		}
		times[mint] = 1;
		ans += min;
		count++;
		if(count == n)break;
	}
	System.out.println(ans);
}
}

