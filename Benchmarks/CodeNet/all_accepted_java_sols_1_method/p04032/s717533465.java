import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s = br.readLine();
		int n = s.length();
		
		if(n == 2)
		{
			if(s.charAt(0) == s.charAt(1))
			{
				System.out.println(1+" "+2);
				return;
			}
		}
		for(int i=0;i+3<n;i++)
		{
			if(s.charAt(i) == s.charAt(i+1) || s.charAt(i+1) == s.charAt(i+2) || s.charAt(i) == s.charAt(i+2))
			{
				System.out.println((i+1)+" "+(i+3));
				return;
			}
		}
		System.out.println(-1+" "+(-1));
	}
}