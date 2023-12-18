
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int K = scan.nextInt();
		int sum = 1;
		for(int i = 0; i < N; i++) {
			if(sum + K > sum * 2) {
				sum *= 2;
			} else {
				sum += K;
			}
		}
		System.out.println(sum);
		scan.close();

	}

}
