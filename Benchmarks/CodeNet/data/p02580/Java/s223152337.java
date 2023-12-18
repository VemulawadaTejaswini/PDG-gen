public class Main {
	public static void main(String[] args) {
		var sc = new java.util.Scanner(System.in);
		var h = sc.nextInt();
		var w = sc.nextInt();
		var m = sc.nextInt();
		var map = new int[h][];
		var sumH = new long[h];
		var sumW = new long[w];
		for (int i = 0; i < h; i++) {
			map[i] = new int[w];
		}
		for (int i = 0; i < m; i++) {
			var hind = sc.nextInt() - 1;
			var wind = sc.nextInt() - 1;
			map[hind][wind]++;
			sumH[hind]++;
			sumW[wind]++;
		}
		long mx = 0;
		long sum = 0;
		for (int i = 0; i < h; i++) {
			sum = sumH[i];
			for (int j = 0; j < w; j++) {
				sum += sumW[j];
				sum -= map[i][j];
				mx = Math.max(mx, sum);
				sum += map[i][j];
				sum -= sumW[j];
			}
		}
		System.out.println(mx);
	}
}