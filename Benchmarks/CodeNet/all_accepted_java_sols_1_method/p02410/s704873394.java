import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int retu = scanner.nextInt();
        int gyou = scanner.nextInt();
        int[][] gyouretu1 = new int[retu][gyou];
        int[][] gyouretu2 = new int[gyou][1];
        for (int i = 0; i < retu; i++) {
            for (int j = 0; j < gyou; j++) {
                int r = scanner.nextInt();
                gyouretu1[i][j] = r;
            }
        }
        for (int j = 0; j < gyou; j++) {
            int b = scanner.nextInt();
            gyouretu2[j][0] = b;
        }
        int goukei = 0;
        for (int i = 0; i < retu; i++) {
            for (int j = 0; j < gyou; j++) {
                goukei += gyouretu1[i][j] * gyouretu2[j][0];
            }
            System.out.println(goukei);
            goukei=0;
        }
    }
}