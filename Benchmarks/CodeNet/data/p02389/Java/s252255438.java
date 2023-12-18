import java.util.Scanner;

class Main{

  public static void main(String[] args){

	int a = 0;
	int b = 0;
	
	Scanner scan = new Scanner(System.in);
	
	  int val = scan.nextInt();
	  a = val;
	
	  val = scan.nextInt();
	  b = val;
	
	  System.out.print(a * b);
	  System.out.print(" ");
	  System.out.print((a + b) * 2));
  }
}