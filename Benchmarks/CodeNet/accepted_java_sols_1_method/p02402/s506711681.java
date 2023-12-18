
import java.util.Scanner;
public class Main{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int max = 0, min = 0, in;
        long sum = 0;
        int a = sc.nextInt();
        for (int i = 0; i < a; i++) {
            in = sc.nextInt();
            if (i == 0) {
                max = in;
                min = in;

            }
            if (in > max)
                max = in;
            if (in < min)
                min = in;
            sum += in;

        }
        System.out.println(min + " " + max + " " + sum);
    }
}

