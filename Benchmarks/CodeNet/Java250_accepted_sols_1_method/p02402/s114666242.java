
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        long goukei = b;
        long saishou = b, saidai = b;

        for (int i = 1; i <= a -1; i++) {
            if (a < 0 && a >= 10000) {
                break;
            }
            b = scanner.nextInt();
            if (-1000000 > b && b >= 1000000) {
                break;
            }
            goukei = b + goukei;
            if (saishou > b) {
                saishou = b;
            }
            if (saidai < b) {
                saidai = b;
            }
        }
        System.out.printf("%d %d %d\n",saishou,saidai,goukei);
    }
}