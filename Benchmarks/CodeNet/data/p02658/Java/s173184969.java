/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    long a[]=new long[n];
	    for(int i=0;i<n;i++)a[i]=sc.nextLong();
	    long ans=0;
	    long max=1000000000000000000l;
	    for(int i=0;i<n;i++){
	        if(ans>max){ans=-1;break;}
	        ans*=a[i];
	    }
		System.out.println(ans);
	}
}
