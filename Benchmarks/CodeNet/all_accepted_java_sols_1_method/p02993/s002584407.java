
import java.util.Scanner;

public class Main {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
	
		int a=0,b=0;
	while(a<str.length())
		{
			if(str.charAt(a++)==str.charAt(a))
			{
				++b;
				System.out.println("Bad");
				break;
		
			}
			if(a==str.length()-1)
				break;
		}
	if(b==0)
	{
		System.out.println("Good");
	}
	}
}
