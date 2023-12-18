import java.util.*;
import java.math.*;
public class Main
{
	public static void main(String[] args) 
	{
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    long arr[] = new long[n];
	    long result =1;
	    for(int i=0;i<n;i++)
	    {
	        arr[i] = sc.nextLong();
	        result *=arr[i];
	    }
	    if(result>Math.pow(10,18))
        {
	        System.out.println("-1");
        }
      	else
        {
      		System.out.println(result);
        }
	}
}
