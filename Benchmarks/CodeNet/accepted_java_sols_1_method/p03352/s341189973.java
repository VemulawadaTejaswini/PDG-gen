import java.util.*;
import java.lang.Math;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int max = 1;
        int i = 2;

        while (i * i <= x) {
            int m = i * i;
            while (m <= x) {
                if (m > max) {
                    max = m;
                }
                m *= i;
            }
            i++;
        }

        System.out.println(max);
    }
}
