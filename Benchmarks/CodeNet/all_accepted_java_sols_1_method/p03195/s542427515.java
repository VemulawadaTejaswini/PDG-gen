import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        boolean found = false;
        for (int i = 0; i < N; i++) {
            int a = sc.nextInt();
            if (a % 2 == 1) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("first");
        } else {
            System.out.println("second");
        }
    }
}
