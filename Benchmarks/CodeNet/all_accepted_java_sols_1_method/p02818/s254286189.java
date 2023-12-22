import java.util.*;
import java.math.*;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		long a=sc.nextLong();
		long b=sc.nextLong();
		long k=sc.nextLong();
		if(a>=k){
			System.out.println(a-k+" "+b);
		}else{
			long p=Math.max((b-(k-a)),0);
			System.out.println(0+" "+p);
		}
	}
}
