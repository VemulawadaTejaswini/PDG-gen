import java.util.Scanner;

public class Main {
	
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		
		String str=s.next();
		
		if(str.charAt(str.length()-1)=='s')
		{
			str=str+"es";
		}
		else
		{
			str=str+"s";
		}
		
		System.out.println(str);
		
	}
	
}