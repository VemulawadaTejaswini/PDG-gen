import java.util.Scanner;

class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	int K, X;
	K = sc.nextInt();
	X = sc.nextInt();

	int count = X - K + 1;
	for (int i = 0; i < (2 * K) - 1; i++, count++)
	    System.out.print(count + " ");

	System.out.println();
    }
}