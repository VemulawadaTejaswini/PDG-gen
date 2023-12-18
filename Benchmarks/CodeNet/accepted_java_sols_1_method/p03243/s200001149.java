
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int a = n / 100;
        int b = (n % 100) / 10;
        int c = n % 10;

        if (a < b || a < c) {
            System.out.println((a + 1) * 100 + (a + 1) * 10 + (a + 1));
        } else {
            System.out.println(a * 100 + a * 10 + a);
        }
    }
}






