import java.util.*;
public class Main {
	public static int n;
	public static int s;
	public static int c;
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		while(true){
			c=0;
			n=sc.nextInt();
			s=sc.nextInt();
			if(n==0&&s==0)break;
			else f(0,0,0);
			System.out.println(c);
		}
	}
	public static void f(int m,int a,int t){
		if(a==n){
			if(t==s)++c;
		}
		else {
			for(int i=m;i<10;++i){
				f(i+1,a+1,t+i);
			}
		}
	}
}