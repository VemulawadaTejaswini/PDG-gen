import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int n1=0,m1=0,tn1,t;
		if (n>1){
            n=n*(n-1)/2;
            n1+=n;
		}else 
		    n1=0;
		
		if (m>1){
		    m=m*(m-1)/2;
		    m1+=m;
		}else
		    m1=0;
		  
		System.out.println(n1+m1);
		    
	}
}
