import java.util.Scanner;

public class Main {
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int n = sc.nextInt();
        int m = sc.nextInt();

        int sum;

        int count = 0;
        for (int i = 1; i <= m; i++) {
            sum = 0;
            for (int j = i; j > 0; j /= 10) {
                sum += j % 10;
            }
//            for (int j = 0; j < is.length; j++) {
//                sum += Integer.parseInt(is[j]);
//            }
            sum += a;
            int rst = 1;
            for (int j = 0; j < n; j++) {
                rst *= sum;
            }
            if (rst == i) {
                count++;
            }

//            if (i == Math.pow((sum + a), n)) {
//                count++;
//            }
        }

        System.out.println(count);
    }

    static int[] intSplit(int n) {
        String[] s = Integer.toString(n).split("");
        int[] a = new int[s.length];

        for (int i = 0; i < s.length; i++) {
            a[i] = Integer.parseInt(s[i]);
        }

        return a;
    }
}
