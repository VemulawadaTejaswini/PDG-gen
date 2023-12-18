import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();

        int max = 0;
        int min = 10000;
        long sum = 0;

        for (int i = 0; i < n; i++) {
            int a = inp.nextInt();

            if (i == 0) {
                min = a;
                max = a;
                sum += a;
            } else {
                if (a < min) {
                    min = a;
                }

                if (a > max) {
                    max = a;
                }

                sum += a;
            }
        }

        System.out.println(min + " " + max + " " + sum);
    }
}

