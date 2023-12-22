import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int A = scanner.nextInt();
		int B = scanner.nextInt();;
		int sum = 0;
		if (A > B) {
			
			sum = A + (A - 1);
			
		}else if (A == B){
			
			sum = A + B;
			
		}else if(A < B){
			
			sum = B + (B - 1);
		}

		System.out.println(sum);
		
	}
}
