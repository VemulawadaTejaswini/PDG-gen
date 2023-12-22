//20200815C
import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long x=sc.nextLong();
		long k=sc.nextLong();
		long d=sc.nextLong();
		if(x<0){
			x=-x;
		}
		if(k%2==1){
			x=x-d;
		}
		k=k/2;
		d=2*d;
		if(x<0){
			x=-x;
		}
		long w=x/d;
		long ans;
		if(w>k){
			ans=x-d*k;
          	
		}else{	
			long t1=x-d*w;
			long t2=d-t1;
			if(t1<t2){
				ans=t1;
              //	System.out.println("a");
			}else{
				ans=t2;
             // 	System.out.println("b");
			}
		}
		System.out.println(ans);
	}
}