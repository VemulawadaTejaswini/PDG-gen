import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	int N, K;
	N = sc.nextInt();
	K = sc.nextInt();

	int H[] = new int[N];
	for (int i = 0; i < N; i++)
	    H[i] = sc.nextInt();

	Arrays.sort(H);

	long sum = 0;
	for (int i = N - K - 1; i >= 0; i--)
	    sum += H[i];

	System.out.println(sum);
    }
}