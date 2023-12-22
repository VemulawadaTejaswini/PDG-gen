import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer[] d = new Integer[n];
        for (int i = 0; i < n; i++) {
            d[i] = sc.nextInt();
        }

        Arrays.sort(d, Collections.reverseOrder());
        int stack = 0;
        int top = 100;
        for (int i = 0; i < d.length; i++) {
            if (i == 0 || top > d[i]) {
                top = d[i];
                stack++;
            }
        }
        System.out.println(stack);
    }

}
