import java.util.*;
public class Main{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c,d,e;
		c=a+b;
		d=a-b;
		e=a*b;
		int x=0;
		if(c>=d &&c>=e){
			x=c;
		}
		if(d>=c &&d>=e){
			x=d;
		}
		if(e>=d &&e>=c){
			x=e;
		}
		System.out.print(x);
	}
}