import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		Set<String> set = new HashSet<>();
		
		for(int i=0; i< t; i++)
		{
			String s = sc.next();
			set.add(s);
		}
		
		System.out.println(set.size());
		
		sc.close();

	}

}
