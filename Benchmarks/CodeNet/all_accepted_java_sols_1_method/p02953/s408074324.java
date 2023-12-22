import java.util.Scanner;

class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	int N = sc.nextInt();
	int H[] = new int[N];
	for (int i = 0; i < N; i++)
	    H[i] = sc.nextInt();

	int max = H[N - 1];
	boolean bl = true;
	for (int i = N - 2; i >= 0; i--) {
	    if (H[i] == H[i + 1] + 1) {
		H[i]--;
	    }

	    if (H[i] <= max) {
		max = H[i];
	    } else {
		bl = false;
	    }
	}

	if (bl)
	    System.out.println("Yes");
	else
	    System.out.println("No");
	    
    }
}