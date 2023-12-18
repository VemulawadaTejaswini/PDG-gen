import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// Recieve StdIn
    	Scanner sc = new Scanner(System.in);
		int D = sc.nextInt();
		int N = sc.nextInt();
		int ret;

		// Declare
		int min;
		if (D==0) {
			min = 1;
		} else if (D==1) {
			min = 100;
		} else {
			min = 10000;
		}

		// Display
		if (N==100) {
			ret = min * (N + 1);
		} else {
			ret = min * N;
		}
		System.out.println(ret);
	}
}
