import java.util.*;

public class Main {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            int d = sc.nextInt();
            int w = sc.nextInt();

            if (d == 0 && w == 0)
                break;

            int[][] pond = new int[d][w];

            for (int[] row : pond) {
                for (int i=0; i < row.length; i++) {
                    row[i] = sc.nextInt();
                }
            }

            int ans = 0;

            for (int startD = 0; startD < d-2; startD++) {
                for (int startW = 0; startW < w-2; startW++) {

                    for (int endD = startD+2; endD < d; endD++) {
                        for (int endW = startW+2; endW < w; endW++) {

                            int lowestAround = check(pond, startD, startW, endD, endW);
                            if (lowestAround != -1) {

                                int size = lowestAround * (endD - startD - 1) * (endW - startW - 1)
                                        - sum(pond, startD+1, startW+1, endD-1, endW-1);
                                ans = Math.max(ans, size);

                            }

                        }
                    }

                }
            }

            System.out.println(ans);
         }

    }

    private static int check(int[][] pond, int startD, int startW, int endD, int endW) {
        int lowestAround = Integer.MAX_VALUE;
        for (int i=startD; i <= endD; i++) {
            lowestAround = Math.min(pond[i][startW], lowestAround);
            lowestAround = Math.min(pond[i][endW], lowestAround);
        }
        
        for (int i=startW; i <= endW; i++) {
            lowestAround = Math.min(pond[startD][i], lowestAround);
            lowestAround = Math.min(pond[endD][i], lowestAround);
        }

        for (int i=startD+1; i < endD; i++) {
            for (int j=startW+1; j < endW; j++) {
                if (pond[i][j] >= lowestAround)
                    return -1;
            }
        }

        return lowestAround;
    }

    private static int sum(int[][] pond, int startD, int startW, int endD, int endW) {
        int sum = 0;
        for (int i=startD; i <= endD; i++) {
            for (int j=startW; j <= endW; j++) {
                sum += pond[i][j];
            }
        }
        return sum;
    }

}

