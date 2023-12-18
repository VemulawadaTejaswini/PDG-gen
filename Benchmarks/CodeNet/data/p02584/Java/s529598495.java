import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        long x=sc.nextLong();
        long k=sc.nextLong();
        long d=sc.nextLong();
        
        x=Math.abs(x);
        long q=k-(x/d);
        long p=x%d;
        if(q<0)
        {
        	System.out.println((x-(k*d)));
        	System.exit(0);
        }
        else
        {
        	if(q%2==1)
        		System.out.println(Math.min(Math.abs(p-d),Math.abs(p+d)));
        	else
        		System.out.println(p);
        }
        
	}

}
