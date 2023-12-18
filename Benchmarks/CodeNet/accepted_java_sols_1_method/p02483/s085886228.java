import java.util.Scanner;

public class Main{
	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);
		int a;
		int b;
		int c;
		int d;
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		if(a>b){
			d=a;
			a=b;
			b=d;
		}
		if(b>c){
			d=c;
			c=b;
			b=d;
		}
		if(a>b){
			d=a;
			a=b;
			b=d;
		}
System.out.println(a+" "+ b+" "+c);
}
}