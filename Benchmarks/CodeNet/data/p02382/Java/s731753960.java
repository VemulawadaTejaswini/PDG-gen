import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int n, max = -1;
        float sum;
        int[] x, yx;
        double ans;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        x = new int [n];
        yx = new int [n];
        for (int i = 0; i < n; i++)
            x[i] = sc.nextInt();
        for (int i = 0; i < n; i++)
            yx[i] = sc.nextInt() - x[i];

        sum = 0;
        for (int i = 0; i < n; i++)
            sum += Math.abs(yx[i]);
        ans = sum;
        System.out.println(ans);

        sum = 0;
        for (int i = 0; i < n; i++)
            sum += yx[i] * yx[i];
        ans = Math.sqrt(sum);
        System.out.println(ans);

        sum = 0;
        for (int i = 0; i < n; i++)
            sum += Math.abs(yx[i] * yx[i] * yx[i]);
        ans = Math.cbrt(sum);
        System.out.println(ans);

        sum = 0;
        for (int i = 0; i < n; i++) {
            if (Math.abs(yx[i]) > max)
                max = Math.abs(yx[i]);
        }
        ans = max;
        System.out.println(ans);
    }
}
