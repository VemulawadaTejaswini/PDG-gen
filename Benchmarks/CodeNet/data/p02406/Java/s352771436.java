import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        // print numbers if it :
        // - is multiple of 3, or
        // - has a digit of 3
        for (int i = 1; i <= n; i++) {
            int x = i;
            if (x % 3 == 0) {
                System.out.print(" "+i);
            } else {
                while (x > 0) {
                    if (x % 10 == 3) {
                        System.out.print(" "+i);
                    }
                    x /= 10;
                }
            }
        }
        System.out.println("");
    }
}
