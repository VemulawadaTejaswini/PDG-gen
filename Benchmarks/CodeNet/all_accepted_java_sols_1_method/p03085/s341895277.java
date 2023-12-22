
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		char ch=scn.next().charAt(0);
		if(ch=='A')System.out.println("T");
		else if(ch=='T')System.out.println("A");
		else if(ch=='C')System.out.println("G");
		else if(ch=='G')System.out.println("C");
	}

}
