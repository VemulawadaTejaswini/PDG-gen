import java.util.Scanner;

class Main {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);

		int a = stdIn.nextInt();
		int b = stdIn.nextInt();
		
		if(a > b){
			System.out.println("a > b");
			
		}
		
		else if(a < b){
			System.out.println("a < b");
			
		}
		
		else{
			System.out.println("a == b");
			
		}
	}


}