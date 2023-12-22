import java.util.Scanner;

class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	int N = sc.nextInt();

	int x = 0;
	for (int i = 1; i <= 9; i++) {
	    if (N % i == 0) {
		x = N / i;
		if (x < 10) {
		    System.out.println("Yes");
		    break;
		}
	    }
	}
	if (x > 9)
	    System.out.println("No");
    }
}