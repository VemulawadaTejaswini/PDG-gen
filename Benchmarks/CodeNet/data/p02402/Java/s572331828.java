import java.util.Scanner;

class Main {

	public static void main(String[] args) {

		Scanner stdIn = new Scanner(System.in);

		int n = stdIn.nextInt();
		int max = stdIn.nextInt();
		int min = max;
		long sum = max;

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