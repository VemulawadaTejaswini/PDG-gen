import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] v = new int[n];
        for (int i = 0; i < n; i++) {
            v[i] = sc.nextInt();
        }
        Arrays.sort(v);

        double val = v[0];
        for (int i = 1; i < n; i++) {
            val = (val + v[i]) / 2;
        }
        System.out.println(val);
    }

}
