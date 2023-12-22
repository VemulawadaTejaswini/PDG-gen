import java.util.Scanner;

public class Main {
    public static void main(final String[] args) {
    	Scanner s = new Scanner(System.in);
    	long a = s.nextLong(), b = s.nextLong(), c = s.nextLong(), d = s.nextLong();
    	long r = b * d;
    	r = Math.max(r, a * c);
    	r = Math.max(r, a * d);
    	r = Math.max(r, b * c);
    	System.out.println(r);
    }
}
