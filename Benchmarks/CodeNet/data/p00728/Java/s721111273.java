import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, avg, min, max, s;
        while (true) {
            n = sc.nextInt();

            if (n == 0) break;

            avg = 0;
            min = 1001;
            max = -1;
            for (int i=0; i<n; i++) {
                s = sc.nextInt();
                avg += s;
                min = s < min ? s : min;
                max = s > max ? s : max;
            }
            avg = (avg-min-max) / (n-2);
            System.out.println(avg);
        }
    }
}