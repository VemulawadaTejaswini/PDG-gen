import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int cityCount = sc.nextInt();
            int trainCount = sc.nextInt();
            int queryCount = sc.nextInt();

            int[][] trainPoint = new int[cityCount + 2][cityCount + 2];
            int[][] cityPoint = new int[cityCount + 2][cityCount + 2];
            for (int t = 0; t < trainCount; t++) {
                trainPoint[sc.nextInt()][sc.nextInt()]++;
            }
            // for(int i = 1; i <= cityCount; i++) {
            // for(int edge = 1; edge <= cityCount; edge++) {
            // cityPoint[i][]
            //
            // }
            // }
            for (int edge = 0; edge < cityCount; edge++) {
                for (int startPoint = 1; startPoint + edge <= cityCount; startPoint++) {
                    cityPoint[startPoint][startPoint + edge] = cityPoint[startPoint][startPoint + edge - 1];
                    for (int i = 0; i <= edge; i++) {
                        cityPoint[startPoint][startPoint + edge] += trainPoint[startPoint + i][startPoint + edge];
                    }
                }
            }

            for (int q = 0; q < queryCount; q++) {
                int l = sc.nextInt();
                int r = sc.nextInt();
                System.out.println(cityPoint[l][r]);
            }

        }
    }
}
