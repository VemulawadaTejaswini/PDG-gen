import static java.lang.System.out;
import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for (int i = 1; i <= n; i++) {                                          
            if (i % 3 == 0) {
                out.printf(i + " ");
            } else if (i % 10 == 3) {
                out.printf(i + " ");
            }
        }
    }
}