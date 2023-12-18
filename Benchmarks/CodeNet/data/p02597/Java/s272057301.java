import java.util.*;
public class Main
{
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int x=sc.nextInt();
	
	String str=sc.next();
	int len=str.length();
	int i=0,j=len-1,count=0;
	while(i<j)
	{
	    while(i<len && j>0 && str.charAt(i)=='R')
	    {
	        i++;
	    }
	    while(j>=0 && i<len-1 && str.charAt(j)=='W')
	    {
	        j--;
	    }
	    if(i<j )
	    {
	        str=str.substring(0,i)+'R'+str.substring(i+1,j)+'W'+str.substring(j+1,len);
	       
	        count++;
	    }
	}
	System.out.println(count);
}
}
