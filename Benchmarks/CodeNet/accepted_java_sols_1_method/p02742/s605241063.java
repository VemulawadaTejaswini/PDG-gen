import java.util.Scanner;

public class Main {
    public static void main(final String[] args) {
    	Scanner s = new Scanner(System.in);
    	int n = s.nextInt(), m = s.nextInt();
    	if (n == 1 || m == 1) {
    		System.out.println(1);
    	} else {
    		System.out.println((long)Math.ceil(n*1.*m/2));
    	}
    	}
    }
