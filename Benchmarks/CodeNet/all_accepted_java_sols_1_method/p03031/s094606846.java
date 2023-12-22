import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), m = sc.nextInt();
		int[][] connect = new int[m][n];
		for (int i = 0; i < m; i++) {
			int l = sc.nextInt();
			for (int j = 0; j < l; j++) {
				connect[i][sc.nextInt()-1] = 1;
			}
		}
		int[] p = new int[m];
		for (int i = 0; i < m; i++) p[i] = sc.nextInt();
		int[] light; int count = 0; boolean flag;
		String format = "%".concat(String.valueOf(n)).concat("s");
		String s;
		for (int i = 0; i < 1<<n; i++) {
			s = String.format(format, Integer.toString(i,2)).replace(' ', '0');
			light = new int[m]; flag = true;
			for (int j = 0; j < n; j++) {
				if(s.charAt(j)=='1') {
					for (int k = 0; k < m; k++) {
						if(connect[k][j]==1)light[k]++;
					}
				}
			}
			for (int j = 0; j < m; j++) {
				if(light[j]%2!=p[j]) flag = false;
			}
			if(flag) count++;
		}
		System.out.println(count);
		sc.close();
	}
}