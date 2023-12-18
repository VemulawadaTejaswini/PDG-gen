import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
//		  System.setIn(A086.class.getResourceAsStream("nyuryoku.txt"));
		  Scanner in = new Scanner(System.in);
		  int a = in.nextInt();
		  int b = in.nextInt();
 
		  int c = a * b;

		  if(c % 2 == 0) {
			  System.out.println("Even");
		  } else {
			  System.out.println("Odd");
		  }
		  in.close();
	}
}