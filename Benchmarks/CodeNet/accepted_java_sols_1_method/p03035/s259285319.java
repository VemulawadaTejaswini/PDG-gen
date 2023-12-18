import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        final Scanner lineScanner = new Scanner(System.in);
        final int A = lineScanner.nextInt();
        final int B = lineScanner.nextInt();
        int cost = 0;
        if (A >= 13) {
        	cost = B;
        } else if (A >= 6 && A <= 12) {
        	cost = B / 2 ;
        } else {
        	cost = 0;
        }
        System.out.println(cost);
    }
}