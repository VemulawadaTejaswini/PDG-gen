import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int input = in.nextInt();
		int S[] = new int[input];
		
		for (int i = 0; i < input; i++)
			S[i] = in.nextInt();
			int nextInput = in.nextInt();
		
		int T[] = new int[nextInput];
		for (int i = 0; i < nextInput; i++)
			T[i] = in.nextInt();
		
		int C = 0;
		for (int i = 0; i < nextInput; i++) {	
			if (linearSearch(S, T[i]))	
				C++;		
		}
		
		System.out.println(C);
		
		}
	public static boolean linearSearch(int arr[], int param) {
		for (int i : arr) {
			if (i == param) {
				return true;
			}
		}
		return false;
		 
	}
}

