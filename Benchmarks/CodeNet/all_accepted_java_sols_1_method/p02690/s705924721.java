import java.util.Scanner;
 
public class Main {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
 
        long x = scan.nextInt();
 
        for (long a = -150; a < 150; a++) {
            for (long b = -150; b < 150; b++) {
                if (Math.pow(a, 5) - Math.pow(b, 5) == x) {
                    System.out.println(a + " " + b);
                    return;
                }
            }
        }
    }
}