import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][][] room = new int[4][3][10];
        for (int i = 0; i < n; i++) {
            int[] a = new int[]{sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt()};
            room[a[0] - 1][a[1] - 1][a[2] - 1] += a[3];
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 10; k++) {
                    System.out.print(" " + room[i][j][k]);
                }
                System.out.println();
            }
            if (i != 3) {
                System.out.println("####################");
            }
        }
    }
}