import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	int N = sc.nextInt();
	int A[] = new int[N];
	for (int i = 0; i < N; i++)
	    A[i] = sc.nextInt();

	Arrays.sort(A);

	boolean bl = true;
	int check = A[0];
	for (int i = 1; i < N; i++) {
	    if (check == A[i]) {
		bl = false;
		break;
	    }

	    check = A[i];
	}

	if (bl)
	    System.out.println("YES");
	else
	    System.out.println("NO");
    }
}