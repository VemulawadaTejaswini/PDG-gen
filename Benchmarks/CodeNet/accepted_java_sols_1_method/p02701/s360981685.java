import java.util.HashSet;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
		HashSet<String> set = new HashSet<>();
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++)
		{
			String s = sc.next();
			set.add(s);
		}
		System.out.println(set.size());
	}

}
