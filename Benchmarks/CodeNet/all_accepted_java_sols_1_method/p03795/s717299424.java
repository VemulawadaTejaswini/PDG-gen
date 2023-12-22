import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        // Input
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // Calc
        int x = 800 * n;		// Payment
        int y = 200 * (n/15);	// Kickback
        int z = x-y;			// Result

        // Output
        System.out.println(z);

        sc.close();

    }
}