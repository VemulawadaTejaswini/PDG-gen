import java.util.*;

public class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int K = sc.nextInt();
	if (K%2 == 0) System.out.print(-1);
	else {
	    long num = 7;
	    int count = 1;
	    boolean isK = true;
	    while (isK) {
		if (num % K == 0) {
		    System.out.print(count);
		    isK = false;
		} else if (num + 7*Math.pow(10,count) < Long.MAX_VALUE) {
		    num += 7 * Math.pow(10,count);
		    count++;
		} else {
		    System.out.print(K-1);
		    isK = false;
		}
	    }
	}
    }
}
