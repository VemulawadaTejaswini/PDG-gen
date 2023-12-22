import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int min = 999;
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            int tmp = sc.nextInt();
            if (tmp % 10 < min && tmp % 10 != 0) {
                min = tmp % 10;
            }

            sum += ((int)Math.ceil(tmp/10.0) * 10);
        }
        if (min != 999) {
            sum = sum - (10 - min);
        }

        System.out.println(sum);
    }
}