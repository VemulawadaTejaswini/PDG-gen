import java.util.Arrays;

import java.util.Scanner;

public class Main {
	private static Scanner sc;
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		int N = sc.nextInt();
		int L = sc.nextInt();
		
		String[] S = new String[N];
		
		for(int i=0 ; i<N ;i++){
			S[i]=sc.next();
		}
		
		Arrays.sort(S);
		
		


        for (int i = 0; i < S.length; i++) {

               System.out.print(S[i]);

        }

		

	}

}