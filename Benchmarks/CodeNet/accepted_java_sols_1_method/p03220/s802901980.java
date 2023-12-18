
import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        int n = sc.nextInt();
        int t = sc.nextInt();
        int a = sc.nextInt();
        int[] h = new int[n];
        float answer = -1;
        int index = -1;
        for (int i = 0; i < n; i++) {
            h[i] = sc.nextInt();
            float temp = (float) (t - (h[i] * 0.006));
            if (answer == -1) {
                answer = Math.abs(a - temp);
                index = i + 1;
                continue;
            }
            if (Math.abs(a - temp) < answer) {
                answer = Math.abs(a - temp);
                index = i + 1;
            }
        }

        System.out.println(index);
    }
}
