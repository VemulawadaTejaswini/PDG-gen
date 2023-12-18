import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int v[] = new int[n];
        double wa = 0;
        for (int i = 0; i < n; i++) {
            v[i] = sc.nextInt();
            wa += v[i];
        }
        Arrays.sort(v);
        double tmp = v[0];
        for (int i = 0; i < n; i++) {
            tmp = (tmp + v[i]) / 2;
        }
        System.out.println(tmp);

        sc.close();
    }
}
