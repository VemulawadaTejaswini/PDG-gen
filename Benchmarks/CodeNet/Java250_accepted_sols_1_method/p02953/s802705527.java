import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] H = new int[N];
		for(int i = 0; i < N; i++) {
			H[i] = sc.nextInt();
		}
		sc.close();
		int h = H[0];
		for(int i = 1; i < N; i++) {
			if(h < H[i]) {
				h = --H[i];
			} else if(h > H[i]) {
				System.out.println("No");
				return;
			}
		}
		System.out.println("Yes");
	}
}
