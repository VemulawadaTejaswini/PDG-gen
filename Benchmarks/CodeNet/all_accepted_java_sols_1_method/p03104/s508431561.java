import java.util.*;

public class Main {
    static final int SIZE = 40;
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		long ans;
		if (a % 2 == 0) {
		    if (b % 2 == 0) {
		        if ((b - a) % 4 != 0) {
		            ans = b ^ 1L;
		        } else {
		            ans = b;
		        }
		    } else {
		        if ((b + 1 - a) % 4 != 0) {
		            ans = 1;
		        } else {
		            ans = 0;
		        }
		    }
		} else {
		    if (b % 2 == 0) {
		        if ((b - (a + 1)) % 4 != 0) {
		            ans = a ^ b ^ 1L;
		        } else {
		            ans = a ^ b;
		        }
		    } else {
		        if ((b + 1 - (a + 1)) % 4 != 0) {
		            ans = a ^ 1;
		        } else {
		            ans = a;
		        }
		    }
		}
		System.out.println(ans);
    }
}

