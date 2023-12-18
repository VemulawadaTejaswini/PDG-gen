import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int n;
		try(Scanner sc = new Scanner(System.in)) {
			n = sc.nextInt();
		}
//		long sum = (n * (n + 1)) / 2;
		long sum = 0;
		for(int i = 1; i <= n; i++) {
			if(i % 3 == 0 || i % 5 == 0) {
				continue;
			}
			sum += i;
		}
		System.out.println(sum);
	}

}
