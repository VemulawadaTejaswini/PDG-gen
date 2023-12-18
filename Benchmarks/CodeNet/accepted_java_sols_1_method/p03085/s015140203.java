import java.util.Arrays;
import java.util.Scanner;

public  class Main  {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String b = sc.next();
		char p[] = b.toCharArray();
		if(p[0]=='A')System.out.println("T");
		if(p[0]=='T')System.out.println("A");
		if(p[0]=='C')System.out.println("G");
		if(p[0]=='G')System.out.println("C");
			
		
		
		
	}
}

