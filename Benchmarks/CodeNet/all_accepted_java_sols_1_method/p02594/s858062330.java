
import java.util.Scanner;

// Problema atcoder

public class Main {


	public static void main(String args[])  {
		
		
		int n;
		String result = "No";
		Scanner input = new Scanner(System.in);
		
		n = input.nextInt();
		
		
	    input.close();
	    
	    if(n>=30)
	    	result="Yes";
		System.out.println(result);
	
}
}

