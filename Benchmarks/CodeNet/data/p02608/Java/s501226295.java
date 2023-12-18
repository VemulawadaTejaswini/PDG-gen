import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int[] check = new int[N + 1];
		//上限値検索
		for (int i = 1; i <= N; i++) {
			int n = i;
			int max = (int) Math.floor(Math.sqrt((double) n));
			for (int s = 1; s <= max; s++) {
				for (int t = 1; t <= max; t++) {
					for (int u = 1; u <= max; u++) {
						if (s * s + t * t + u * u + s * t + t * u + u * s > n) {
							break;
						}
						if (s >= t && t >= u && s * s + t * t + u * u + s * t + t * u + u * s == n) {
							if (s != t & t != u && u != s) {
								check[i] += 6;
							} else if (s == t && t == u && u == s) {
								check[i]++;
							} else {
								check[i] += 3;
							}
						}
					}
				}
			}
		}
		for (int i = 1; i <= N; i++) {
			System.out.println(check[i]);
		}
	}

}
