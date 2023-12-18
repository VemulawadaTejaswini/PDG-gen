
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int k = Integer.parseInt(scan.next());
        scan.close();

        int sum = 0;
        for (int a = 1; a <= k; a++) {
            for (int b = 1; b <= k; b++) {
                for (int c = 1; c <= k; c++) {
                    int min = Math.min(a, Math.min(b, c));
                    int gcd = 1;
                    for (int i = 1; i <= min; i++) {
                        if (a % i == 0 && b % i == 0 && c % i == 0) {
                            gcd = i;
                        }
                    }
                    sum += gcd;
                }
            }
        }

        System.out.println(sum);
    }

}
