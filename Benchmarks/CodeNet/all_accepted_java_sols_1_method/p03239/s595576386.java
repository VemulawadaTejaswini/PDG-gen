import java.util.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numRoutes = sc.nextInt();
        int timeLimit = sc.nextInt();

        int[] c = new int[numRoutes];
        int[] t = new int[numRoutes];

        for (int i = 0; i < numRoutes; i++) {
            c[i] = sc.nextInt();
            t[i] = sc.nextInt();
        }

        int optimalRoute = -1;
        for (int i = 0; i < numRoutes; i++) {
            if (t[i] > timeLimit) {
                continue;
            }

            if (optimalRoute == -1) {
                optimalRoute = i;
                continue;
            }

            if (c[i] < c[optimalRoute]) {
                optimalRoute = i;
            }
        }

        if (optimalRoute == -1) {
            System.out.println("TLE");
        } else {
            System.out.println(c[optimalRoute]);
        }

    }
}