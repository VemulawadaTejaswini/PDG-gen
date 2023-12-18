import java.util.Scanner;

class Main {

	public static void main(String[] args) {

		int max = 0;
		int min = 0;
		int sum = 0;
		int n;

		Scanner stdIn = new Scanner(System.in);

		n = stdIn.nextInt();
		max = min = sum = stdIn.nextInt();

		for (int i = 1, tmp = 0; i < n; i++) {
			tmp = stdIn.nextInt();

			if(max < tmp) {
				max = tmp;
			}
			if(min > tmp) {
				min = tmp;
			}
			sum += tmp;
		}
		System.out.println(min + " " + max + " " + sum);
	}
}