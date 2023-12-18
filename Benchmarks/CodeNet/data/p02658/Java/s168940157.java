import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long max = (long) Math.pow(10, 18);
        Long[] a = new Long[n];
        long answer = 1;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
            if (a[i] == 0) {
                answer = 0;
                break;
            }
        }
        sc.close();

        if (answer != 0) {
            for (int i = 0; i < n; i++) {
                if (answer * a[i] > max || answer * a[i] < 0) {
                    answer = -1;
                    break;
                }
                answer *= a[i];
            }
        }
        System.out.println(answer);
    }
}
