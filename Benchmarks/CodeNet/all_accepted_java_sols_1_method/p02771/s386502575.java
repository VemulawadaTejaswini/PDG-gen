import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		int A = stdIn.nextInt();
		int B = stdIn.nextInt();
		int C = stdIn.nextInt();

		if(A == C && A != B){
			System.out.println("Yes");
		}
		else if(A == B && A != C){
			System.out.println("Yes");
		}
		else if(B == C && B != A){
			System.out.println("Yes");
		}
		else{
			System.out.println("No");
		}
		stdIn.close();
	}
}
