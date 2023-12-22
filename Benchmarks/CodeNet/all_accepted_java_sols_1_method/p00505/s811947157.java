import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] r = new int[4];
        for (;;) {
            int[] l = new int[] { sc.nextInt(), sc.nextInt(), sc.nextInt() };
            Arrays.sort(l);
            if (l[0] + l[1] <= l[2]) {
                r[0] = r[1] + r[2] + r[3];
                for (int i = 0; i < 4; i++) {
                    System.out.print(r[i] + (i == 3 ? "\n" : " "));
                }
                break;
            }
            int a = l[0] * l[0] + l[1] * l[1];
            int b = l[2] * l[2];
            if (a == b) {
                r[1]++;
            } else if (a > b) {
                r[2]++;
            } else {
                r[3]++;
            }
        }

    }
}
