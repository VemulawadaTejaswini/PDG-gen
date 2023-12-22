import java.util.Scanner;

class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	int N = sc.nextInt();
	int a[] = new int[N];

	for (int i = 0; i < N; i++)
	    a[i] = sc.nextInt();

	int count = 1;
	int sum = 0;
	for (int i = 0; i < N; i++) {
	    if (a[i] == count) {
		count++;
	    } else {
		sum++;
	    }
	}

	if (count == 1)
	    System.out.println(-1);
	else
	    System.out.println(sum);

    }
}