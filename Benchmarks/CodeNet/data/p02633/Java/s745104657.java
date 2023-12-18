import java.util.*;
public class Main{
	static int gcd(int x, int y){
		if(x<y)gcd(y,x);
		if(y == 0)return x;
		return gcd(y,x%y);
	}
	static int lcm(int x, int y){
		return x*y/gcd(x,y);
	}

	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		System.out.print(lcm(360, x)/x);
	}
}
