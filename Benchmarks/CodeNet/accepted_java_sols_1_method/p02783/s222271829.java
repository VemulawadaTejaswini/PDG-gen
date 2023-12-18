import java.util.Scanner;
 
class Main {
 
	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
 
		int A = stdIn.nextInt();
		int B = stdIn.nextInt();

		if(A % B == 0 ){
			System.out.print( A / B);
		}else{
			System.out.print( A / B + 1);
		}

	}
    
}