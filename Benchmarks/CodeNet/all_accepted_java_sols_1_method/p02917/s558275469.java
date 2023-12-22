
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	int a[]=new int[1000],i,j,n,sum,k,m;
    Scanner b =new Scanner(System.in);
    n= b.nextInt();
    for(i=0;i<n-1;i++)
    {
    	a[i]=b.nextInt();
    }
    sum=a[0];
    for(i=0;i<n-2;i++)
    {
    	if(a[i]>=a[i+1])
    	{
    		sum=sum+a[i+1];
    	}
    	else if(a[i+1]>a[i])
    	{
    		sum=sum+a[i];
    	}
    }
    sum=sum+a[n-2];
    System.out.println(""+sum);
	}

}
