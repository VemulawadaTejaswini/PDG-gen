
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);


		try{
long  x=sc.nextLong();
 long k=sc.nextLong();
long d=sc.nextLong();
long steps=x/d;
long remaining=k-steps;

long ans=0;
if(k==0) {
	System.out.println(0);
}else {
if(k>=steps) {
	ans=x-steps*d;
	if(remaining%2==0) {
		if(Math.abs(ans-d)<=ans) {
			ans-=d;
		}
	}else {
		ans-=d;
	}
	System.out.println(Math.abs(ans));
}else {
	x-=k*d;
	System.out.println(Math.abs(x));
}
}
		}catch(Exception e){
		    return;
		}
	}

}
