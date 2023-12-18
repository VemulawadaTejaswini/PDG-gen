import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		long sum = 1;
		for (int i = 0; i < N; i++) {
			if(sum <= 1000000000000000000L) {
				sum *= sc.nextLong();
			} else {
				sum = -1;
				break;
			}
		}
		
		System.out.println(sum);
		sc.close();
	}
}
