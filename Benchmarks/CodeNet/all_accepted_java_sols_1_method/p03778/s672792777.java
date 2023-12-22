import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a + w >= b && a <= b + w) {
            System.out.println(0);
            return;
        }
        if (a + w < b) {
            System.out.println(b - (a + w));
            return;
        }
        System.out.println(a - (b + w));
    }

}
