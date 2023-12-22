import java.util.HashMap;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		
		int n=s.nextInt();
		
		HashMap<String,Integer> map=new HashMap<>();
		
		for(int i=0;i<n;i++)
		{
			String str=s.next();
			
			map.put(str,1);
		}
		
		System.out.println(map.size());
		
	}
	
}