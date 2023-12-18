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
            for (int i = 0; i < a; i++) {
                for (int j = 0; j < b; j++) {
                    if (i == 0 || j == 0 || i == (b - 1) || j == (a - 1)) {
                        System.out.print("#");
                    } else {
                        System.out.print(".");
                    }
                }
                System.out.print("\n");
            }
            System.out.print("\n");
        }

    }
}

