import java.util.*;
public class Main {
    public static long mod(long x, long y){
    return x%y<0?x%y+(y<0?-y:y):x%y;
    }
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long a = 1000000007;
        long b = 1;
        long c = 1;
        long d = 1;
        for(int i=0;i<n;i++){b*=10;
                             c*=9;
                             d*=8;
                             b=mod(b,a);
                             c=mod(c,a);
                             d=mod(d,a);
                            }       
		System.out.println(mod(b-2*c+d,a));
	}
}