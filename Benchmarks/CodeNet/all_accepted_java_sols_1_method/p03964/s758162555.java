import java.util.ArrayList;
import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    int n=sc.nextInt();
	    long a=-1;long b=-1; 
	    for(int i=1;i<=n;i++)
	    {
	        long x=sc.nextLong();
	        long y=sc.nextLong();
	        if(x>=a&&y>=b)
	        {
	            a=x;
	            b=y;
	        }
	        else
	        {
	           long st=(a%x==0)?a/x:a/x+1;
	           long en=(b%y==0)?b/y:b/y+1;
	           long dx=Math.max(st,en);
	           a=dx*x;
	           b=dx*y;
	        }
	    }
	    System.out.println(a+b);
	}}