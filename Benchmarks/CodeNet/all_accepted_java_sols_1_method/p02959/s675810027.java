import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int monster[] = new int[n + 1];
        int hero[] = new int[n];

        for (int i = 0; i < n + 1; i++) {
            monster[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            hero[i] = sc.nextInt();
        }

        long ans = 0;

        for (int i = 0; i < n; i++) {
            if (hero[i] <= monster[i]) {
                ans += hero[i];
            } else {
                ans += monster[i];
                hero[i] -= monster[i];
                if (hero[i] <= monster[i + 1]) {
                    ans += hero[i];
                    monster[i + 1] -= hero[i];
                } else {
                    ans += monster[i + 1];
                    monster[i + 1] = 0;
                }
            }
        }

        System.out.println(ans);

        sc.close();

    }

}