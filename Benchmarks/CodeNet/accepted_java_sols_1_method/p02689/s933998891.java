import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int M = scanner.nextInt();
		int H[] = new int[N];
		int G[] = new int[N];
		int count = 0;
		for(int i = 0; i < N; i++) {
			H[i] = scanner.nextInt();
		}
		for(int i = 0; i < M; i++) {
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			if(H[a-1] > H[b-1]) {
				G[b-1] -= 1;
			} else if (H[a-1] < H[b-1]) {
				G[a-1] -= 1;
			} else {
				G[a-1] -= 1;
				G[b-1] -= 1;
			}
			for (int l = 0; l < N; l++) {
				//System.out.println(G[l]);
			}
			//System.out.println("");
		}

		for (int i = 0; i < N; i++) {
			if (G[i] == 0) {
				count += 1;
			}
		}
		System.out.println(count);
	}
}