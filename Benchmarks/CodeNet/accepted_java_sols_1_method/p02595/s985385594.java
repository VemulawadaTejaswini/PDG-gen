import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        long d = sc.nextInt();
        d = d*d;
        int count = 0;

        for (int i = 0; i < n; i++) {
            long x = sc.nextInt();
            long y = sc.nextInt();
            long z = x*x + y*y;
            if (z <= d) {
                count++;
            }
        }
        System.out.println(count);
	}
}
