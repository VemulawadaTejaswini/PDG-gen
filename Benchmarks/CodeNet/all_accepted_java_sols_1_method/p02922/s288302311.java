import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        final int A = scan.nextInt();
        final int B = scan.nextInt();
        scan.close();

        int socket = 1;
        int tap = 0;
        boolean isLack = B > 1;

        while (isLack) {
            socket = socket - 1 + A;
            tap++;
            if (socket >= B) {
                isLack = false;
            }
        }

        System.out.println(tap);
    }

}
