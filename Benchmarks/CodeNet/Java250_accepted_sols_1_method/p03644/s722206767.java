import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int i = 1;
        while (true) {
            if (i > n) {
                System.out.println(i / 2);
                return;
            }
            i *= 2;
        }
    }
}
