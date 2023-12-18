import java.util.*;
public class Main
{
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int x=sc.nextInt();
	
	String str=sc.next();
	ArrayList<Integer> arr=new ArrayList<Integer>();
	int len=str.length();
	
	for(int z=0;z<len;z++)
	{
	  if(str.charAt(z)=='W')
	    arr.add(1);
	   else 
	     arr.add(0);
	} 
	int i=0,j=len-1,count=0;
	while(i<j)
	{
	    while(i<len && j>0 && arr.get(i)==0)
	    {
	        i++;
	    }
	    while(j>=0 && i<len-1 && arr.get(j)==1)
	    {
	        j--;
	    }
	    if(i<j )
	    {
	        arr.set(i,0);
	        arr.set(j,1);
	       
	        count++;
	    }
	}
	System.out.println(count);
}
}
