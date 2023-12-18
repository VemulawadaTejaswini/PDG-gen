import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner scan = new Scanner(System.in);
        double N = scan.nextInt();
        double X = scan.nextInt();
       double T = scan.nextInt();
double p=Math.ceil(N/X)*T;
System.out.println((int)p);
    }
}
