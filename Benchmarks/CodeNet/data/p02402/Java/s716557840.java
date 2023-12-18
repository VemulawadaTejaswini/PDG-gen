import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int count = sc.nextInt();

		int max = -1000000, min = 1000000, sum = 0;
		for(int i=0; i<count; i++) {
			int n = sc.nextInt();
			if(n > max) max = n;
			if(n < min) min = n;
			sum += n;
			// System.out.println(n);
		}

		sc.close();

		System.out.println(min + " " + max + " " + sum);

	}

}

