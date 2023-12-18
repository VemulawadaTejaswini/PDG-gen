import java.util.*;
public class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		sc.useDelimiter("\\s");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		if(a>b){
			int  t=a;
			a=b;
			b=t;
		}if(a>c){
			int y=a;
			a=c;
			c=y;
		}if(b>c){
			int x;
			x=c;
			c=b;
			b=x;
		}
		System.out.println(a+" "+b+" "+c);
	}
}