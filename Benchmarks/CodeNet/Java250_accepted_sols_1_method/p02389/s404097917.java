import java.io.IOException;
import java.util.Scanner;


public class Main {

	static int inputA,inputB;
	
	public static void main(String args[]) throws NumberFormatException, IOException{
		Scanner in = new Scanner(System.in);
		int inputA=in.nextInt();
		int inputB=in.nextInt();
		
		System.out.println(inputA*inputB+" "+(inputA+inputB)*2);
		
		
	}
	
}