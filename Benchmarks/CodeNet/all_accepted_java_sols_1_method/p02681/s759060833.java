import java.util.*;
class Main {
 
    
    public static void main(String[] str)
    {
    	Scanner s=new Scanner(System.in);
    	String s1=s.next();
    	String s2=s.next();
    	int n=s2.length();
    	int i=0;
    	String res=s2.substring(i,n-1);
    	if(res.equals(s1))
    	{
    		System.out.println("Yes");
    	}
    	else
    	{
    		System.out.println("No");
    	}
   
    	
    }
}