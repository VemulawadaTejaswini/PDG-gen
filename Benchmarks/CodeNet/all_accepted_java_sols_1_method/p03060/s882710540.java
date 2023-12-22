import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] v = new int[n];
        int[] c = new int[n];
        for (int i = 0; i < n; i++) {
            v[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            c[i] = sc.nextInt();
        }
        int result = 0;
        for (int i = 0; i < n; i++) {
            int dif = v[i] - c[i];
            if (dif >= 0) {
                result += dif;
            }
        }
        System.out.println(result);
        sc.close();
    }
}