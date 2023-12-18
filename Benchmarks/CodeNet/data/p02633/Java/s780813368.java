import java.util.*;
public class Main {
    public static long gcd(long x,long y){
        if(x < y) return gcd(y, x);
        if(y == 0) return x;
        return gcd(y, x % y);
    }
    public static long lcm(long x,long y){                                                              
        return x*y/gcd(x,y);                                                                                                                                                                                                                
    }
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();		
		System.out.println(360/gcd(360,a));
	}
}