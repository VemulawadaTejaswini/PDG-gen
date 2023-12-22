import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] monsters = new int[n + 1];
        int[] heroes = new int[n];

        for (int i = 0; i < n + 1; i++)
            monsters[i] = sc.nextInt();
        for (int i = 0; i < n; i++)
            heroes[i] = sc.nextInt();

        int rem = 0;
        long totalKilled = 0;
        for (int i = 0; i < n; i++) {
            int killedPrev = Math.min(rem, monsters[i]);
            int killedNow = Math.min(monsters[i] - killedPrev, heroes[i]);

            totalKilled += killedPrev + killedNow;
            rem = Math.max(heroes[i] - killedNow, 0);
        }
        totalKilled += Math.min(rem, monsters[n]);
        System.out.println(totalKilled);
    }
}
