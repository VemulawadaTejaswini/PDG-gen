
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
	long a=s.nextLong();
	long b=s.nextLong();
	long k=s.nextLong();
	
	if(a>0&&k>0){
	    
	if(a>=k){
	a-=k;
	k=0;}
	else{
	k-=a;
	a=0;
	}
	}
	 if(b>0&&k>0){
	if(b>=k){
	b-=k;
	k=0;}
	else{
	
	k-=b;
	b=0;
	}
	 }
	
	System.out.println(a+" "+ b);
	}
}
	