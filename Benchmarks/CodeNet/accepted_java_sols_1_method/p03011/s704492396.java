import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] p = new int[3];

        for (int i = 0; i < 3; i++) {
            p[i] = sc.nextInt();
        }

        Arrays.sort(p);

        int sum = 0;

        sum += p[0];
        sum += p[1];

        System.out.println(sum);

        sc.close();
        ;
    }
}