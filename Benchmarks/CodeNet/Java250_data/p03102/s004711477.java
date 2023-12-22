import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int c = sc.nextInt();

        int[] b = new int[m];
        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
        }

        int cor = 0;
        for (int i = 0; i < n; i++) {
            int tmp = 0;
            for (int j = 0; j < m; j++) {
                int a = sc.nextInt();
//                System.out.println(a*b[j]);
                tmp += (a * b[j]);
            }
            tmp += c;
            if (0 < tmp) cor++;
        }
        System.out.println(cor);
    }
}
