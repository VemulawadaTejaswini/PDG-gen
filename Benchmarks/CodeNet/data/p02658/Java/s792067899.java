import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        long result = 1;
        long[] c = new long[a];
        long b = (long) Math.pow(10, 18);

        for (int i = 0; i < a; i++) {
            c[i] = scan.nextLong();

        }

        Arrays.sort(c);
        if (c[0] == 0) {
            System.out.println(0);
            return;
        }

            for (int j = 0; j < a; j++) {
                result *= c[j];

                if (result > b) {
                    result = -1;
                }
            }

            System.out.println(result);


        scan.close();
    }

}