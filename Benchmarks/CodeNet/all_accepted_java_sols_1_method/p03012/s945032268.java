
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] w = new int[n];
        int sum = 0;
        for (int i = 0 ;i < n ; i++) {
            w[i] = sc.nextInt();
            sum += w[i];
        }

        int s = 100000000;
        for (int i = 0 ; i < n  ; i++) {
            int b = 0;
            for (int j = 0 ; j < i ; j++) {
                b += w[j];
            }

            s = Math.min(s, Math.abs(sum - b - b));
        }

        System.out.println(s);
    }

}