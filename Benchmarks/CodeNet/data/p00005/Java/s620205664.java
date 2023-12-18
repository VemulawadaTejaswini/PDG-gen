import java.util.Scanner;
public class Main {
    public static void main (String[] args) {
	Scanner scan = new Scanner(System.in);
	long a, b;
	String[] input;
	while (scan.hasNext()){
	    input = scan.nextLine().split(" ");
	    a = Integer.parseInt(input[0]);
	    b = Integer.parseInt(input[1]);
	    long lcm = solveLCM(a, b);
	    long gcd = solveGCD(a, b);
	    System.out.println(gcd + " " + lcm);
	}
    }
    static long solveGCD (long a, long b) {
	if (a == 0 || b == 0) {
	    return 0;
	}
	if (a == b) {
	    return 1;
	}
	long x = Math.max(a, b);
	long y = Math.min(a, b);
	long d = x % y;
	while (d > 1 && (x % d != 0 && y % d != 0)) {
	    x = y;
	    y = d;
	    d = x % y;
	}
	return d;
    }

    static long solveLCM (long a, long b) {
	if (a == 0 || b == 0) {
	    return 0;
	}
	long i = 1;
	long max = Math.max(a, b);
	long lcm = max * i++;
	long min = Math.min(a, b);
	while (lcm % min != 0) {
	    lcm = max * i++;
	}
	//return lcm;
	return a * b / solveGCD(a,b);
    }
}