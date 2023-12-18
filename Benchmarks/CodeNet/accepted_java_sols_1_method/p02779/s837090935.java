
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner std = new Scanner(System.in);
        int n = std.nextInt();
        int[] as = new int[n];
        for (int i = 0; i < n; i++) {
            as[i] = std.nextInt();
        }

        Arrays.sort(as);
        int current = Integer.MAX_VALUE;
        boolean distinct = true;
        for (int i = 0; i < as.length; i++) {
            int a = as[i];
            if (current == a) {
                distinct = false;
                break;
            } else {
                current = a;
            }
        }

        if (distinct) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
