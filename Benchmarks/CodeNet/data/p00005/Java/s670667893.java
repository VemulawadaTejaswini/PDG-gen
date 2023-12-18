import java.util.*;
public class Main{
    static Scanner kbd = new Scanner(System.in);
    public static void main(String[] args){
	while(kbd.hasNext()){
	    long a = kbd.nextLong();
	    long b = kbd.nextLong();
	    if(a>b) {
		long w = a;
		a = b; 
		b = w;
	    }

	    long gcd = a;

	    while(a%gcd!=0 || b%gcd!=0) gcd -= 2;

	    long lcm = a*b/gcd;

	    System.out.println(gcd+" "+lcm);
	}
    }
}