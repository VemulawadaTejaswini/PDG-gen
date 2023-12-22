import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = Integer.parseInt(sc.next());

        int a = x % 100;
        int b = x / 100;
        if (a == 0) {
            System.out.println("1");
            return;
        }


        for (int i = 0; i < b; i++) {
            if (a > 5) {
                a = a - 5;
            } else {
                System.out.println("1");
                return;
            }
        }

        if (a == 0) {
            System.out.println("1");
            return;
        }
        System.out.println("0");
    }
}
