import java.util.Scanner;
public class Main {
    public static void main (String[] args) {
	Scanner scan = new Scanner(System.in);
	int a, b;
	String[] input;
	while (scan.hasNext()){
	    input = scan.nextLine().split(" ");
	    a = Integer.parseInt(input[0]);
	    b = Integer.parseInt(input[1]);
	    int lcm = solveLCM(a, b);
	    int gcd = solveGCD(a, b);
	    System.out.println(gcd + " " + lcm);
	}
    }
    static int solveGCD (int a, int b) {
	int x = Math.max(a, b);
	int y = Math.min(a, b);
	int d = x % y;
	while ((x % d != 0 && y % d != 0) && d != 1) {
	    x = y;
	    y = d;
	    d = x % y;
	}
	return d;
    }

    static int solveLCM (int a, int b) {
	int i = 1;
	int max = Math.max(a, b);
	int lcm = max * i++;
	int min = Math.min(a, b);
	while (lcm % min != 0) {
	    lcm = max * i++;
	}
	return lcm;
    }
}