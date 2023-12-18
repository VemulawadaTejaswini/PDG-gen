import java.util.Scanner;
import java.util.Arrays;

class Main {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int S[] = new int [n];
		
		for (int i = 0; i < n; i++){
			S[i] = scan.nextInt();
		}
		
		java.util.Arrays.sort(S);
		
		for (int i = 0; i < n - 1; i++){
			System.out.printf("%d ", S[i]);
		}
		System.out.println(S[n - 1]);
	}
}