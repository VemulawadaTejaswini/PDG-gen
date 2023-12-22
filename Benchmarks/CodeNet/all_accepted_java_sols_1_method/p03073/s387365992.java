
import java.util.*;
import java.math.*;
public class Main {
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int dif = 0;
		String N = sc.next();
		
		for (int i = 0; i < N.length();i+=2)
		{
			char c1 = N.charAt(i);
			if (c1 == '1') {dif++;}
			
			if(i+1 < N.length())
			{
			char c2 = N.charAt(i+1);	
			if (c2 == '0') {dif++;}
			}
			
		}
      
      int ans = Math.min(dif,(N.length()-dif));
		
		System.out.println(ans);
		
	

	}
}