import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int x = Math.abs(a - b);
        int y = Math.abs(b - c);
        int z = Math.abs(c - a);

        if (x <= y) {
            if (y <= z) {
                System.out.println(x + y);
            } else {
                System.out.println(x + z);
            }
        } else {
            if (x <= z) {
                System.out.println(x + y);
            } else {
                System.out.println(y + z);
            }
        }

    }
}

