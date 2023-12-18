//Digit Number
import java.io.IOException;
import java.util.Scanner;

class Main{
	
	public static void main(String[] args) throws IOException {
		

		  Scanner scan = new Scanner(System.in);

		  while(scan.hasNext()){
		  
			    String[] ab = scan.next().split(" ");

			    int a = Integer.parseInt(ab[0]);
			    int b = Integer.parseInt(ab[1]);
		  
			    String out  =Integer.toString(a+b);
			    System.out.println(out.length());
			    
		  }
		
	}
}