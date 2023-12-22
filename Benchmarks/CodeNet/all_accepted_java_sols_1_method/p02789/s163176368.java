import java.util.Scanner;
 
class Main {
 
	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
 
		int A = stdIn.nextInt();
		int B = stdIn.nextInt();

		if(A == B ){
			System.out.print("Yes");
		}else{
			System.out.print("No");
		}

	}
    
}