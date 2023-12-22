import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        String b = sc.next();

        long x = Long.parseLong(a + b);

        for (long i = 1; i < x; i++) {
            if ((i * i) == x) {
                System.out.println("Yes");
                return;
            }
        }
        System.out.println("No");
    }
}
