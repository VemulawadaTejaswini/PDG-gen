import java.util.*;
public class Main {
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        long k = sc.nextLong();
        long d = sc.nextLong();
        x = Math.abs(x);
        long y = x / d;
        long pos = x % d;
        long neg = Math.abs(pos - d);
        if (y >= k) {
            System.out.println((y - k) * d + pos);
        } else {
            if ((k - y) % 2 == 0) {
                System.out.println(pos);    
            } else {
                System.out.println(neg);
            }
        }
	}
}