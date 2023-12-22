import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int a = cin.nextInt();
        int b = cin.nextInt();
        int k = cin.nextInt();

        if (b - a < k * 2) {
            for (int i = a; i <= b; i++) {
                System.out.println(i);
            }
        } else {
            for (int i = a; i < a + k; i++) {
                System.out.println(i);
            }
            for (int i = b - k + 1; i <= b; i++) {
                System.out.println(i);
            }
        }
    }
}
