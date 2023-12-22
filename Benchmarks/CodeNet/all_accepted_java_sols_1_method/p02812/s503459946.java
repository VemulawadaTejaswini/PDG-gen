import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
	    Scanner sc = new Scanner(System.in);
	    
	    int n = sc.nextInt();
	    String s = sc.next();
	    int count=0;
	    for(int i=0;i<n-2;i++)
	    {
	        String a  = s.substring(i , i+3);
	        if(a.equals("ABC"))
	            count++;
	    }
		System.out.println(count);
	}
}
