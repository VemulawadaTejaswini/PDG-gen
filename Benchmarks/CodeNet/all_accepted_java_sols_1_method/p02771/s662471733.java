import java.util.Scanner;
 
class Main {
 
	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
 
		int A = stdIn.nextInt();
		int B = stdIn.nextInt();
		int C = stdIn.nextInt();
		boolean D = false;
		
		
		if(A==B){
			if(B==C){
				System.out.println("No");
			}else{
				System.out.println("Yes");
			}
		}else{
			if(B==C){
				System.out.println("Yes");
			}else if(A==C){
				System.out.println("Yes");
			}else{
				System.out.println("No");
			}
		}
 
	}
    
}