import java.util.Scanner;

class Main {
    public static void main(String[] args)  {
	Scanner sc = new Scanner(System.in);

	int N, K;
	N = sc.nextInt();
	K = sc.nextInt();

	double probability_all = 0.0;
	for (int i = 0; i < N; i++) {
	    int sum = i + 1;
	    double count = 1.0;
	    while (sum < K) {
		sum *= 2;
		count /= 2;
	    }

	    probability_all += count;
	}

	System.out.println((double)(probability_all / N));
    }
}