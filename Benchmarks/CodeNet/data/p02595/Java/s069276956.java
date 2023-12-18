import java.util.*;

class Main
 {
	public static void main (String[] args)
	 {
        Scanner sc = new Scanner(System.in);
        long n, d;
        n = sc.nextLong();
        d = sc.nextLong();
        int ans = 0;
        for(int i = 0; i < n; i++) {
            long x, y;
            x = Math.abs(sc.nextLong());
            y = Math.abs(sc.nextLong());
            if(Math.sqrt(x*x + y*y) <= d) {
                ans++;
            }
        }
        System.out.println(ans);
	 }
}