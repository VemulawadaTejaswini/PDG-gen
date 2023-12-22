import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        Integer[] p = new Integer[n];
        for (int i = 0; i < n; i++) {
            p[i] = Integer.parseInt(sc.next());
        }

        Arrays.sort(p);
        int result = 0;
        for (int i = 0; i < n; i++) {
            if (i == p.length- 1) {
                result += p[i] / 2;
            } else {
                result += p[i];
            }
        }

        System.out.println(result);
    }
}