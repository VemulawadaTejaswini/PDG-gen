import java.util.*;
public class Main{
	public static void main(String[] args) { 
		Scanner sc = new Scanner(System.in);
		int c,d;
		while(sc.hasNext()){
			int a=sc.nextInt();
			int b=sc.nextInt();
			c=s(a,b);
			d=a/c*b;
			System.out.println(c+" "+d);
		}
	}
	static int s(int a,int b){
		return b==0?a:s(b, a%b);
	}
}