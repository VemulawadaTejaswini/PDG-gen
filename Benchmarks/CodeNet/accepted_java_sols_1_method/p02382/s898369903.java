import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int n, max = -1;
        long sum;
        int[] x, yx;
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
        System.out.println(sum);

        sum = 0;
        for (int i = 0; i < n; i++)
            sum += yx[i] * yx[i];
        System.out.println(Math.sqrt(sum));

        sum = 0;
        for (int i = 0; i < n; i++)
            sum += Math.abs(yx[i] * yx[i] * yx[i]);
        System.out.println(Math.cbrt(sum));

        sum = 0;
        for (int i = 0; i < n; i++) {
            if (Math.abs(yx[i]) > max)
                max = Math.abs(yx[i]);
        }
        System.out.println(max);
    }
}
