import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		long A = scan.nextLong();
		long B = scan.nextLong();
		long C = scan.nextLong();
		long D = scan.nextLong();
		if(A+B >C+D){
			System.out.println("Left");
		}else if(A+B == C+D){
			System.out.println("Balanced");
		}else{
			System.out.println("Right");
		}
		
	}

}