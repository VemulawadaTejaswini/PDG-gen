import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();

        for (int i = 1 ; i <= 1000 ; i++) {
            int eight = (int) (i * 0.08);
            int ten = (int) (i * 0.1);
            if (eight == A && ten == B) {
                System.out.println(i);
                return;
            }
        }

        System.out.println(-1);
    }
}
