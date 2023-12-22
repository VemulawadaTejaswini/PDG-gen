import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long s = scanner.nextInt();
        scanner.close();

        long index = 1;

        if (s == 1 || s == 2) {
            System.out.println(4);
            return;
        }

        while (true) {
            if (s == 4) {
                break;
            }

            if (s % 2 == 0) {
                s = s / 2;
                index++;
            } else {
                s = 3 * s + 1;
                index++;
            }

        }

        System.out.println(index + 3);

    }
}
