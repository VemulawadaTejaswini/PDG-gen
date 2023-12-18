

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextInt()) {
            int[] a = {sc.nextInt(), sc.nextInt(), sc.nextInt()};
            Arrays.sort(a);
            System.out.println(a[0] + a[1]);
        }
    }
}
