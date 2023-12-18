import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		System.out.println();

		int b = sc.nextInt();
		int min = b;
		int max = b;
		int total = b;

			for(int i = 0; i < a - 1; i++) {
				b = sc.nextInt();

				if(min > b) {
					min = b;
				}
				if(max < b) {
					max = b;
				}
				total = total + b;
			}

			System.out.println(min + " " + max + " " + total);
	}
}