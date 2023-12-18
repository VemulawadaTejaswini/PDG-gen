import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int a = stdIn.nextInt();
        int b = stdIn.nextInt();
        int c = 0;

        for (int i = 0; i < 2; i++) {
            if (a > b) {
                c += a;
                a--;
            } else {
                c += b;
                b--;
            }
        }
        System.out.println(c);
    }
}