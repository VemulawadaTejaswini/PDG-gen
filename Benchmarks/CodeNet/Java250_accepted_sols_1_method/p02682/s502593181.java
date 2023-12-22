import java.util.*;
import java.math.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        long k = sc.nextLong();
        if(a+b<=k){
            long ans = a-(k-a-b);
            System.out.println(ans);
        } else if(a<=k){
            System.out.println(a);
        } else if(a>k){
            System.out.println(k);
        }
	}
}