import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        long x=sc.nextLong();
        long k=sc.nextLong();
        long d=sc.nextLong();
        if(x==k && k==d)
        {
        	System.out.println(x);
        	
            System.exit(0);
        }
        x=Math.abs(x);
        k=k-(x/d);
        x=x%d;
        if(k<=0)
        {
        	System.out.println((x-(k*d)));
        	System.exit(0);
        }
        else
        {
        	if(k%2==1)
        		System.out.println(Math.abs(x-d));
        	else
        		System.out.println(x);
        }
        
	}

}
