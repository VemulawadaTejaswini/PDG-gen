import java.util.*;

public class Main{
	private static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args){
		
		int x = scan.nextInt();
		int y = scan.nextInt();
		int gcd;
		if(x > y){
			gcd = x % y;
		} else if(x < y){
			gcd = y % x;
		} else{
			gcd = x;
		}
		System.out.println(gcd);
	}
}