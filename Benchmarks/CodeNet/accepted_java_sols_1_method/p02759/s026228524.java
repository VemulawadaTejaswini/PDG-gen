import java.util.Scanner;
 
class Main {
 
	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
 
		int A = stdIn.nextInt();

		int B;

		int C;

		B = A / 2 ;
		C = A % 2 ;
		
		if(C==1){
			System.out.println(B=B+1);
		}else{
			System.out.println(B);
		}
    }
}