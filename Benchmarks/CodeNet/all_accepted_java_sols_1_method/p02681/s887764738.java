import java.util.*;
import java.lang.*;
 
public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		String s,s1;
		s=sc.next();
		s1=sc.next();
		int t,f=0;
		if(((s1.length()-s.length()) ==1) && (Character.isLetter(s1.charAt(s1.length()-1))))
		{
		    for(t=0;t<s.length();t++)
		    {
		        if(s.charAt(t) != s1.charAt(t))
		        f=1;
		    }
		    if(f==0)
		    {
		        System.out.println("Yes");
		    }
		    else{
		        System.out.println("No");
		    }
		}
		else{
		    System.out.println("No");
		    
		}
		    
		    
		}
}
