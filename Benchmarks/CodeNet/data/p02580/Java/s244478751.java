public class Main {
	public static void main(String[] args) {
		var sc = new java.util.Scanner(System.in);
		var h = sc.nextInt();
		var w = sc.nextInt();
		var m = sc.nextInt();
		var map = new boolean[h][];
		var sumH = new int[h];
		var sumW = new int[w];
		for (int i = 0; i < h; i++) {
			map[i] = new boolean[w];
		}
		for (int i = 0; i < m; i++) {
			var hind = sc.nextInt() - 1;
			var wind = sc.nextInt() - 1;
			map[hind][wind] = true;
			sumH[hind]++;
			sumW[wind]++;
		}
		int mx = 0;
		int sum = 0;
		for (int i = 0; i < h; i++) {
			sum = sumH[i];
			for (int j = 0; j < w; j++) {
				sum += sumW[j];
				sum -= (map[i][j]) ? 1 : 0;
				mx = Math.max(mx, sum);
				sum += (map[i][j]) ? 1 : 0;
				sum -= sumW[j];
			}
		}
		System.out.println(mx);
	}
}