import java.util.Scanner;

public class Main{

	public static void main(String[] args) {

		int a,b;

		Scanner scan = new Scanner(System.in);

		while(true)
		{
		    a = scan.nextInt();
		    b = scan.nextInt();

		    if( (a | b) == 0) break;

		    else if(b<a)
		    {
		    	a ^= b;
		    	b ^= a;
		    	a ^= b;
		    }

		    System.out.println(a + " " + b);
		}
		scan.close();
	}
}