import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int sum = 1;

		for(int i = 0; i < n; i++) {
			if (i == 0) {
				sum *= k;
			} else {
				sum *= k-1;
			}
		}
		System.out.println(sum);
	}

}
