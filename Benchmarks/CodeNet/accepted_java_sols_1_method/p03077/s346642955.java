import java.util.*;
public class Main {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    long N = sc.nextLong();
        long A = sc.nextLong();
        long ans = (long)Math.ceil((double)N/A);
        for (int i=0; i<4; i++) {
            long num = (long)Math.ceil((double)N/sc.nextLong());
        	ans = (num > ans)? num: ans;
        }
	    System.out.println(ans+4);
	}
}