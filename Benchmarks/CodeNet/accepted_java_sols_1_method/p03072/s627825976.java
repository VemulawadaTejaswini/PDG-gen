import java.util.Scanner;

// B - Great Ocean View
public class Main {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int N = sc.nextInt();
	int[] H = new int[N];
	for (int i = 0; i < N; i++) {
		H[i] = sc.nextInt();
	}
	int max = 0;
	int count = 0;
	for (int i = 0; i < N; i++) {
		if (H[i] >= max) {
			max = H[i];
			count++;
		}
	}
	System.out.println(count);
	}
}