import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = sc.nextInt();
        long kp2 = 0;
        long kp1 = 0;
        long ans = 0L;
        for (int i = 1; i <= n; i++) {
            if (i % k == k/2) kp2++;
            if (i % k == 0) kp1++;
        }

        if(k % 2 != 0) kp2 = 0;

        System.out.println(kp1*kp1*kp1+kp2*kp2*kp2);
    }
}