import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int A = scanner.nextInt();
		int B = scanner.nextInt();
		int answer;
		
		if(A >= 13) {
			
			answer = B;
		}else if(A >= 6) {
			
			answer = B / 2;
			
		}else{
			
			answer = 0;
		}

		System.out.println(answer);
	}

}