import java.util.Scanner;
import java.util.Arrays;
/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		try {
		    Scanner sc = new Scanner(System.in);
		    int t,n,i,k;
		    String s = sc.nextLine();
		    if(s.charAt(s.length()-1) == 's')
		     s=s+"es";
		     else
		     s=s+"s";
		     System.out.println(s);
		} catch(Exception e) {
		}
	}
}
