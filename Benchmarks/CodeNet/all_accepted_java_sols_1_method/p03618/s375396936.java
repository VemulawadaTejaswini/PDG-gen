import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		
		long n = s.length();
		long p = 0;
		
		long[] oc = new long[26];
		
		for(int i = 0; i < n; i++)
			oc[s.charAt(i)-'a']++;
		
		for(int i = 0; i < 26; i++)
		{
			p += (oc[i]*(oc[i]-1))/2;
			
			
		}

		
		long an = (n*(n-1))/2;
		an-=p;
		an++;
		System.out.println(an);

	}

}
