import java.util.*;

public class Main {

	public static void main(String[] args) {
	
		int x=0,y=0,a=0,b=0,c=0;
		Scanner sc=new Scanner(System.in);
		x=sc.nextInt();
		for(int i=0;i<x;i++){
			a=sc.nextInt();
			b=sc.nextInt();
			c=sc.nextInt();
			if(a>=b && a>=c);
			else if(b>=c){
				y=c;
				c=a;
				a=b;
				b=y;
			}
			else if(c>=b){
				y=b;
				b=a;
				a=c;
				c=y;
			}
			if(a*a==b*b+c*c)System.out.println("YES");
			else System.out.println("NO");
		}
	
	}
	}
		