import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int min = sc.nextInt();
		int max = sc.nextInt();
		int divide = sc.nextInt();
		sc.close();

		int count = 0;
		for(int i=min; i<=max; i++) {
			if(divide % i == 0) count++;
		}

		System.out.println(count);

	}

}

