import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		int a;
		int b;
		int c;
		Scanner scan=new Scanner(System.in);
		a=scan.nextInt();
		b=scan.nextInt();
		c=scan.nextInt();
		int x;
		if(a>b){
		x =a;
		a=b;
		b=c;
		}
		if(b>c){
			x=b;
			b=c;
			c=x;
			
		}
		if(a>b){
			x =a;
			a=b;
			b=x;	
		}
		System.out.print(a+" "+b+" "+c);
	}
}
