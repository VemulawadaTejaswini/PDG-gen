import java.util.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int count = 0;
        for (int i = 105; i <= N; i += 2) {
            int numDiv = 0;
            for (int div = 1; div <= i; div++) {
                if (i % div == 0) {
                    numDiv++;
                }
            }
            if (numDiv == 8) {
                count++;
            }
        }

        System.out.println(count);
    }
}