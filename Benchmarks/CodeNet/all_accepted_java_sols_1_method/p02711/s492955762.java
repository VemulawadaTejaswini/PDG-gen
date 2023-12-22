import java.util.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		boolean b = false;
		
		while(n>0){
		    int r = n%10;
		    if(r==7) b = true;
		    n = n/10;
		}
		
		if(b) System.out.println("Yes");
		else System.out.println("No");
	}
}