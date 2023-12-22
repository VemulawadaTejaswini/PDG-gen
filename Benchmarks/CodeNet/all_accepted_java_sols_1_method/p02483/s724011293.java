import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int x=0;
		if(a>b){
			x=a;
			a=b;
			b=x;
		}if(a>c){
			x=a;
			a=c;
			c=x;
		}if(b>c){
			x=c;
			c=b;
			b=x;
		}
		System.out.println(a+" "+b+" "+c);
	}
}