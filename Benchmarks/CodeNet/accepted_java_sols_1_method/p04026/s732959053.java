import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		
		for(int i = 0; i < s.length(); i++)
		{
			if(i >= 1 && s.charAt(i) == s.charAt(i-1))
			{
				System.out.println(i + " " + (i+1));
				return;
			}
			else if(i>=2 && s.charAt(i) == s.charAt(i-2))
			{
				System.out.println((i-1) + " " + (i+1));
				return;
			}
		}
		System.out.println("-1 -1");
	}

}
