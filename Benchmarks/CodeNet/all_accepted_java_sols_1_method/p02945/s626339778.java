import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int y=sc.nextInt();
		int a,b,c;
		a=x+y;
		b=x-y;
		c=x*y;
		if(a>=b&&a>=c){
			System.out.print(a);
		}else if(b>=a&&b>=c){
			System.out.print(b);	
		}else if(c>=a&&c>=b){
			System.out.print(c);	
		}
	}
}