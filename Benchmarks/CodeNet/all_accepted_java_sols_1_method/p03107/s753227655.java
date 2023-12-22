import java.util.*;
class Main 
{ 

	
	 
	public static void main(String args[]) 
	{ 
		Scanner s = new Scanner(System.in);
		char[] c = s.next().toCharArray();
		int one=0;
		for(int i=0;i<c.length;i++)
		{
			if(c[i]=='1')
			{
				one++;
			}
			else
			{
				one--;
			}
		}
		System.out.println(c.length-Math.abs(one));

		
		
		
	}
} 
