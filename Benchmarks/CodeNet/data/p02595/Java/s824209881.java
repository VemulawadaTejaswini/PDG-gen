import java.util.*;

public class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int N = sc.nextInt();
	int D = sc.nextInt();
	int count = 0;
	long x,y;
	for (int i=0; i<N; i++) {
	    x = sc.nextLong();
	    y = sc.nextLong();
	    if (Math.sqrt(x*x + y*y) <= (double)D) count++;
	}
	System.out.print(count);
    }
}
