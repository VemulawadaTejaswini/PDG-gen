import java.util.Scanner;
 
class Main {
 
	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
 
		String S = stdIn.next();
		String T = stdIn.next();
		
		int A = stdIn.nextInt();
		int B = stdIn.nextInt();
 
		String U = stdIn.next();
	
		if( S.equals(U)){
			A--;
			System.out.print( A +" "+ B);
		}else if (T.equals(U)){
			B--;
			System.out.print( A +" "+ B);
		}

	}
    
}