import java.util.Scanner;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		
		int[] l = new int[N];
		// 棒の長さ受け取り
		for (int i=0; i<N; i++) {
			int next = sc.nextInt();
			// 長さを比べて長い方が最初になるように入れる
			if (i > 0) {
				for (int j=0; j<i; j++) {
					// 長ければその場所に
					if (next > l[j]) {
						System.arraycopy(l, j, l, j+1, i-j);
						l[j] = next;
						break;
					} else if (j+1 == i) {
						l[i] = next;
					}
				}
			} else {
				l[i] = next;
			}
		}
		// K個の棒をつなげる
		int sum = 0;
		for (int i=0; i<K; i++) {
			sum += l[i];
		}
		// 答えの出力
		System.out.println(sum);
	}
}