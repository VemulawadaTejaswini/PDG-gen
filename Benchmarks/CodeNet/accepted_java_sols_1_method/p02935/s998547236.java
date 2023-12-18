import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int v[] = new int[n];
        for (int i = 0; i < n; i++) {
            v[i] = sc.nextInt();
        }
        sc.close();
        Arrays.sort(v);

        double maxValue = v[0];
        for (int i = 1; i < n; i++) {
            maxValue = (maxValue + v[i]) / 2;
        }

        System.out.println(maxValue);
    }
}
