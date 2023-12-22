import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int i = 0;
        while (true) {
            if (i % 2 == 0) {
                c -= b;
            } else {
                a -= d;
            }
            if (c <= 0) {
                System.out.println("Yes");
                return;
            }
            if (a <= 0) {
                System.out.println("No");
                return;
            }
            i++;
        }
    }

}
