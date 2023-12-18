//package atcoder;
 
import java.util.*;
 
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int a,b;
		if(X>=500) {
			a = 1000*(X/500);
			//System.out.println(a);
			b = X%500/5*5;
			//System.out.println(b);
			System.out.println(a+b);
		}
		if(X<500) {
			b = X/5*5;
			System.out.println(b);
		}
	}
}