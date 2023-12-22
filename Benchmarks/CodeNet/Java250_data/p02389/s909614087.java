//2704 上石　彩花
import java.util.Scanner;
public class Main{
	int a,b,c,d;
	
	public void solve(){
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		
		c=a*b;
		d=2*a+2*b;
		
		System.out.print(c+" ");
		System.out.println(d);
	}
	public static void main(String[]args){
		Main obj=new Main();
		obj.solve();
	}
}