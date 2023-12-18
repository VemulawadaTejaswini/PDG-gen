import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextInt();
        long b = sc.nextInt();
        sc.close();

        if (a == b) {
            System.out.println("-1");
            return;
        }

        if (a % b == 0) {
            System.out.println("-1");
        } else {
            System.out.println(a);
        }
    }
}
