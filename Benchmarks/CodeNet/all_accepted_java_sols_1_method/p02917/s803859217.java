import java.util.Scanner;

class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	int N = sc.nextInt();
	int B[] = new int[N - 1];
	for (int i = 0; i < N - 1; i++)
	    B[i] = sc.nextInt();

	int count = B[0];
	for (int i = 0; i < N - 2; i++) {
	    if (B[i] < B[i + 1])
		count += B[i];
	    else
		count += B[i + 1];
	}
	count += B[N - 2];

	System.out.println(count);
    }
}