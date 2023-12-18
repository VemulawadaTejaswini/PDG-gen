import java.util.Scanner;
public class Main {
    public static void main (String[] args) {
	Scanner scan = new Scanner(System.in);
	int n = Integer.parseInt(scan.nextLine());
	int factorial = 1;
	for (int i = n; i > 0; i--) {
	    factorial *= i;
	}
	System.out.println(factorial);
    }
}