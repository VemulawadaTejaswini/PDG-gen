import java.util.*;

public class Main {
	public static void main (String[] args) {
    	Scanner sc = new Scanner(System.in);
    	long a = sc.nextInt();
    	long b = sc.nextInt();
    	long c = sc.nextInt();
    	long d = sc.nextInt();
    	System.out.println(Math.max(Math.max(a * c, a * d), Math.max(b * c, b * d)));
	}
}