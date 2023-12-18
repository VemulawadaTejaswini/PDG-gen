import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		int[] S;
		int[] T;
		int C = 0;
		
		Scanner keyboard = new Scanner(System.in);
		
		int S_length = keyboard.nextInt();
		S = new int[S_length];
		
		keyboard.nextLine();
		
		String S_inputString = keyboard.nextLine();
		
		Scanner S_input = new Scanner(S_inputString);
		
		int T_length = keyboard.nextInt();
		T = new int[T_length];
		
		keyboard.nextLine();
		
		String T_inputString = keyboard.nextLine();
		
		Scanner T_input = new Scanner(T_inputString);
		
		for(int i = 0; i < S_length; i++) {
			S[i] = S_input.nextInt();
		}
		
		for(int i = 0; i < T_length; i++) {
			T[i] = T_input.nextInt();
		}
		
		for(int i = 0; i < T.length; i++) {
			if(contains(T[i], S)) C++;
		}
		
		System.out.println(C);
		
		
	}
	
	public static boolean contains(int query, int[] check) {
		
		boolean containsInt = false;
		
		for(int i = 0; i < check.length; i++) {
			if(query == check[i]) containsInt = true;
		}
		
		return containsInt;
		
	}

}
