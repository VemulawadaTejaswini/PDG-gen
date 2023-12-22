import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		boolean poor = false;
		if(A == B && B == C){
			poor = false;
		}else if(A == B || B == C || A == C){
			poor = true;
		}
		if(poor){
			System.out.println("Yes");
		}else{
			System.out.println("No");			
		}
	}
}
