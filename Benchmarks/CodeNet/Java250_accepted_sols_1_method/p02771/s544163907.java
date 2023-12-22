import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);

        int a, b, c;
        a = cin.nextInt();
        b = cin.nextInt();
        c = cin.nextInt();

        if (a == b | b == c | a == c) {
            if (a == b && b == c) {
                System.out.println("No");
            } else {
                System.out.println("Yes");
            }
        } else {
            System.out.println("No");
        }
    }
}
