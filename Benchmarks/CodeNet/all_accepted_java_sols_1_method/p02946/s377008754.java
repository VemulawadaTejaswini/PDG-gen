import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        int x = in.nextInt();

        for (int i = x - k + 1; i <= x + k - 1; i++) {
            System.out.print(i);

            if (i == x + k - 1) {
                System.out.println();
            } else {
                System.out.print(' ');
            }
        }
    }
}
