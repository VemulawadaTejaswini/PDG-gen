import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int A = in.nextInt();
            int B = in.nextInt();
            int C = in.nextInt();
            int D = in.nextInt();
            int E = in.nextInt();
            int F = in.nextInt();

            int[][] dp = new int[3001][3001];
            dp[0][0] = 1;
            for (int water = 0; water < 3001; water++) {
                for (int sugar = 0; sugar < 3001; sugar++) {
                    if (dp[water][sugar] == 0) {
                        continue;
                    }

                    if (water + 100 * A + sugar <= F) {
                        dp[water + 100 * A][sugar] = dp[water][sugar];
                    }
                    if (water + 100 * B + sugar <= F) {
                        dp[water + 100 * B][sugar] = dp[water][sugar];
                    }
                    if (water + sugar + C <= F) {
                        if ((sugar + C) <= E * water / 100) {
                            dp[water][sugar + C] = dp[water][sugar];
                        }
                    }
                    if (water + sugar + D <= F) {
                        if ((sugar + D) <= E * water / 100) {
                            dp[water][sugar + D] = dp[water][sugar];
                        }
                    }
                }
            }

            int maxWater = 100;
            int maxSugar = -1;
            for (int water = 100; water < 3001; water += 100) {
                for (int sugar = 0; sugar < 3001; sugar++) {
                    if (dp[water][sugar] == 0) {
                        continue;
                    }
                    if ((double) sugar / (water + sugar) > (double) maxSugar / (maxWater + maxSugar)) {
                        maxWater = water;
                        maxSugar = sugar;
                    }
                }
            }

            System.out.println((maxWater + maxSugar) + " " + maxSugar);
        }
    }
}
