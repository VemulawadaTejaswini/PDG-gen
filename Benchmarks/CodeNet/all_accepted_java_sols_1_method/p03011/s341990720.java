import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int P      = scanner.nextInt();
		int Q      = scanner.nextInt();
		int R      = scanner.nextInt();
		int sumA   = P + Q;
		int sumB   = Q + R;
		int sumC   = P + R;
		int answer = 0;
		
		if(sumA < sumB) {
			
			answer = sumA;
		}else {
			
			answer = sumB;
		}
		
		if(sumC < answer) {
			
			answer = sumC;
		}
		System.out.println(answer);
	}

}
