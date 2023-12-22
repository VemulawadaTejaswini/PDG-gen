import java.util.Scanner;

class Main {
	static int x;
	static int minI;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		x = sc.nextInt();
		int i = 1;
		int sum = 0;
		while (true) {
			sum += i;
			if (sum >= x) {
				break;
			}
			i++;
		}

		System.out.println(i);

		sc.close();
	}

}
