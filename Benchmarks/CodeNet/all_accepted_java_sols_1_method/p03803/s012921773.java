import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int A = scanner.nextInt();
		int B = scanner.nextInt();
		if(A == 1) A=14;
		if(B == 1) B=14;
		if(A < B){
			System.out.println("Bob");
		}else if(A > B){
			System.out.println("Alice");
		}else{
			System.out.println("Draw");
		}
		System.out.println();
		scanner.close();
	}
}
