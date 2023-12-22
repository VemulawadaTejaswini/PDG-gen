import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num;
        int max = -10000000, min = 1000000;
        long sum = 0;

        num = Integer.parseInt(scan.next());

        for (int i = 0; i < num; i++) {
            int buf;
            buf = Integer.parseInt(scan.next());
            if (buf > max) {
                max = buf;
            }
            if (buf < min) {
                min = buf;
            }
            sum += (long)buf;
        }

        System.out.println(min + " " + max + " " + sum);
    }
}

