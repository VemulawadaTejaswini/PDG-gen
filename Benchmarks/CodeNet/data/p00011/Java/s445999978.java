import java.util.Scanner;
class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int w, n, a, b, i, swap;
		w = scan.nextInt();
		int[] amidakuji = new int[w];
		n = scan.nextInt();
		for (i = 0; i < w; i ++) amidakuji[i] = i;
		for (i = 0; i < n; i ++) {
			a = scan.nextInt();
			b = scan.nextInt();
			a --; b --;
			swap = amidakuji[a]; amidakuji[a] = amidakuji[b]; amidakuji[b] = swap;
		}
		for (i = 0; i < w; i ++) {
			System.out.println(amidakuji[i] + 1);
		}
	}
}