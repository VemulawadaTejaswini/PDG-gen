import java.util.Scanner;
import java.util.InputMismatchException;

class Main{

  public static void main(String[] args){

	int a = 0;
	int b = 0;
	
	Scanner scan = new Scanner(System.in);
	
	try{
	  int val = scan.nextInt();
	  a = val;
	
	  val = scan.nextInt();
	  b = val;
	
	  System.out.print((a * b) + " " + ((a + b) * 2));
	}catch(InputMismatchException e){
	System.out.print("??\?????¨????????§??????" + e);
	}
  }
}