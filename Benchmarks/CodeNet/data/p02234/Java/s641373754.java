import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		int[] data = new int[n + 1];
		int[][] cost = new int[n + 1][n + 1];

		for(int i = 1; i <= n; i++) {
			cost[i][i] = 0;
		}
		
		data[0] = scan.nextInt();
		data[1] = scan.nextInt();
		
		for(int i = 2; i <= n; i++) {
			scan.nextInt();
			data[i] = scan.nextInt();
		}
		
		
		for(int i = 1; i < n; i++) {
			cost[i][i + 1] = data[i - 1] * data[i] * data[i + 1];
		}
		
		for(int i = 0; i <= n - 3; i++) {
			for(int j = 3 + i; j <= n; j++) {
				cost[j - 2 - i][j] = scan(j - 2 - i, j, cost, data);
			}
		}
		
		System.out.println(cost[1][n]);
		scan.close();
	}
	
	static int scan(int a, int b, int[][] cost, int[] data) {
		int MIN = Integer.MAX_VALUE;
		int num = b - a;
		
		for(int i = 0; i < num; i++) {
			int min = cost[a][a + i] + cost[a + i + 1][b] + data[a - 1] * data[a + i] * data[b];
			if(MIN > min) {
				MIN = min;
			}
		}
		return MIN;
	}
}