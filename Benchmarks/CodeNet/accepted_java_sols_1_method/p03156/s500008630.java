import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int can1 = 0;
        int can2 = 0;
        int can3 = 0;
        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            if (val <= a) {
                can1++;
            } else if (val <= b) {
                can2++;
            } else {
                can3++;
            }
        }

        int min = Math.min(can1,Math.min(can2, can3));
        System.out.println(min);
    }
}