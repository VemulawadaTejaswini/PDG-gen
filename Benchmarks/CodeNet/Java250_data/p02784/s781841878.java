import java.util.Scanner;

class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	int H, N;
	H = sc.nextInt();
	N = sc.nextInt();
	
	int A[] = new int[N];
	int sum = 0;
	for (int i = 0; i < N; i++) {
	    A[i] = sc.nextInt();
	    sum += A[i];
	}

	if (H > sum)
	    System.out.println("No");
	else
	    System.out.println("Yes");
    }
}