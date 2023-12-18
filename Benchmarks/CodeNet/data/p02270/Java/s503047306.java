import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] w = new int[n];

        int minP = 0;
        for (int i = 0; i < n; i++) {
            w[i] = sc.nextInt();
            minP = Math.max(minP, w[i]);
        }

        int p = minP;
//        U.println("minP: " + minP);
        while (true) {
            int kNeeded = 1;
            int remainedP = p;

            for (int i = 0; i < n; i++) {
//                U.println("kN: " + kNeeded + ", rP: " + remainedP + ", i: " + i);
//                U.println("\t w[i]: " + w[i]);
                if (remainedP >= w[i]) {
                    remainedP -= w[i];
                } else {
                    kNeeded++;
                    remainedP = p - w[i];
                }
            }
//            U.println("kNeeded: " + kNeeded);
            if (kNeeded <= k)
                break;
            p++;
        }

        System.out.println(p);
    }
}
