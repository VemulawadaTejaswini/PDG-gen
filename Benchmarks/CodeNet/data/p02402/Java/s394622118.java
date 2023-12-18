import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long a = sc.nextLong();

		long b = sc.nextLong();
		long min = b;
		long max = b;
		long total = b;

			for(int i = 2; i <= a; i++) {
				b = sc.nextLong();

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