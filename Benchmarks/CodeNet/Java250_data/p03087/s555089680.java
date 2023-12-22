
import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int q = scanner.nextInt();
        String s = scanner.next();
        int [] l = new int[q];
        int [] r = new int[q];
        for (int i = 0; i < q; ++i) {
            l[i] = scanner.nextInt();
            r[i] = scanner.nextInt();
        }
        int [] sum = new int[n];
        for (int i = 0; i  + 1 < s.length(); i++) {
            if (s.charAt(i) == 'A' && s.charAt(i + 1) == 'C') {
                sum[i + 1]++;
            }
            sum[i + 1] += sum[i];
        }

        for (int i = 0; i < q; ++i) {
            int left = l[i] - 1;
            int right = r[i] - 1;
            if (s.charAt(left) == 'C') {
                int res = sum[right] - sum[left];
                System.out.println(res);
            } else {
                int res = sum[right];
                if (left - 1 >= 0) {
                    res -= sum[left - 1];
                }
                System.out.println(res);
            }
        }

    }

}
