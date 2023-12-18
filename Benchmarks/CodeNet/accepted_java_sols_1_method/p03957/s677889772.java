import java.util.Scanner;
import java.util.regex.*;
public class Main
{
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		String str=input.nextLine();
		String pattern=".*C.*F.*";
		if(Pattern.matches(pattern,str)) System.out.println("Yes");
		else System.out.println("No");
   }
}