import java.util.Scanner;
public class Main {
    public static void main (String[] args) {
	Scanner scan = new Scanner(System.in);
	int a, b;
	String[] input;
	while (scan.hasNext()) {
	    input = scan.nextLine().split(" ");
	    a = Integer.parseInt(input[0]);
	    b = Integer.parseInt(input[1]);
	    System.out.println(determineDigits(a+b));
	}
    }
    static int determineDigits (int a) {
	int digits = 0;
	while (a > 0) {
	    digits ++;
	    a /= 10;
	}
	return digits;
    }
}