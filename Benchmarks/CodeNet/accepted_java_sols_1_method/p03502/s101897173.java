import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int n = N;
		int sum = 0;
		while(N >= 1) {
			sum = sum + (N % 10);
			N = N  / 10; 
		}
		if(n % sum == 0) {
			System.out.println("Yes");
		}
		else if(n % sum != 0) {
			System.out.println("No");
		}
		sc.close();

	}
}
