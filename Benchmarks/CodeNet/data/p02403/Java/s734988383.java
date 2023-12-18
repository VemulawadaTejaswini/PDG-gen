import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0;
        int b = 0;
        while (true) {
            a = sc.nextInt();
            b = sc.nextInt();
            if (a == 0 && b == 0) {
                break;
            }
            for (int i = 0; i < b; i++) {
                for (int j = 0; j < a; j++) {
                    System.out.print("#");
                }
                System.out.print("\n");
            }
            System.out.print("\n");
        }

    }
}
