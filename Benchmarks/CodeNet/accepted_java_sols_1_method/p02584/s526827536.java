
import java.util.*;


public class Main{

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Long x=sc.nextLong();
		Long k=sc.nextLong();
		Long d=sc.nextLong();
		
		if(x<0)x*=-1;
		
		Long div=x/d;
		if(div>k) {
			System.out.println(x-d*k);
			return;
		}
		
		k-=div;
		x=x%d;
		
		long ans1=x;
		long ans2=Math.abs(x-d);
		
		if(k%2==0)System.out.println(ans1);
		else System.out.println(ans2);
		
		
	}

	
}
