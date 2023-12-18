import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
			Scanner s= new Scanner(System.in);
		  char s1= s.next().charAt(0);
		  
		  if(s1 >='A' && s1 <= 'Z')
		    System.out.println("A");
		   else
		  	System.out.println("a");
	}

}
