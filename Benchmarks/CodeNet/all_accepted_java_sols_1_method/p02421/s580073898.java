
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int sum1 = 0;
        int sum2 = 0;

        for (int i = 0; i < a; i++) {
            String b = sc.next();
            String c = sc.next();
            if (b.compareTo(c) > 0)
                sum1 += 3;
            else if (b.compareTo(c) < 0)
                sum2 += 3;
            else {
                sum1 += 1;
                sum2 += 1;
            }
        }
        System.out.println(sum1 + " " + sum2);
    }
}

