import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    while(sc.hasNext()){
	    	long a=sc.nextLong();
	    	long b=sc.nextLong();
	        System.out.println(gcd(a,b)+" "+a/gcd(a,b)*b);
	    }
	}
	public static long gcd(long a,long b){
		if(b==0)return a;
		else return gcd(b,a%b);
	} 
}
//by TTTMongolia 11/05/2012