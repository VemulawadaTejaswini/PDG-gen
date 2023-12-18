import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner( System.in );
		int n = sc.nextInt();
		
		int[] S = new int[13];
		int[] H = new int[13];
		int[] C = new int[13];
		int[] D = new int[13];
		
		int NG = 0;
		int OK = 1;
		
		for(int i = 0; i < 13; i++) {
			S[i] = NG;
			H[i] = NG;
			C[i] = NG;
			D[i] = NG;
			
		}
		
		for(int i = 0; i < n; i++){
			String suit = sc.next();
			int num		= sc.nextInt();
			num -= 1;
			
			if ( suit.equals("S") ) {
				S[num] = OK;
				
			} else if ( suit.equals("H") ) {
				H[num] = OK;
				
			} else if ( suit.equals("C") ) {
				C[num] = OK;
				
			} else if ( suit.equals("D") ) {
				D[num] = OK;
				
			}
			
		}
		
		for(int i = 0; i < 13; i++){
			if ( S[i] == NG ) {
				System.out.println("S "+(i+1));
			}
			
		}
		for(int i = 0; i < 13; i++){
			if ( H[i] == NG ) {
				System.out.println("H "+(i+1));
			}
			
		}
		
		for(int i = 0; i < 13; i++){
			if ( C[i] == NG ) {
				System.out.println("C "+(i+1));
			}
			
		}
		
		for(int i = 0; i < 13; i++){
			if ( D[i] == NG ) {
				System.out.println("D "+(i+1));
			}
			
		}
		
		
		
		
		
	}
	
}