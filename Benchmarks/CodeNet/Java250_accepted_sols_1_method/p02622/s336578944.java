
import java.util.*;
import java.math.*;
public class Main {
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		String T = sc.next();
		int A = 0;
		
		char[] s2 = S.toCharArray();
		char[] t2 = T.toCharArray();
		
		for (int i = 0 ; i < s2.length; i++)
		{
			if (s2[i]!=t2[i])
			{A++;}
			
		}
		
		
		System.out.println(A);
   
        }
		
	}