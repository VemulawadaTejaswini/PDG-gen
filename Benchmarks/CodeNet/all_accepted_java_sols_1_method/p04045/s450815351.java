import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        Boolean[] dislike = new Boolean[10];
        Arrays.fill(dislike, Boolean.FALSE);
        for (int i = 0; i < k; i++) {
            int tmp = sc.nextInt();
            dislike[tmp] = true;
        }

        for (int i = n; ; i++) {
            int tmp = i;
            boolean flag = true;
            while (tmp > 0) {
                int bit = tmp % 10;
                tmp /= 10;
                if (dislike[bit]) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.println(i);
                break;
            }
        }
    }
}