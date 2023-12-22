import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[][][] room = new int[4][3][10];
        int b,f,r,v;

        for (int i = 0; i < room.length; i++) {
            for (int j = 0; j < room[0].length; j++) {
                for (int k = 0; k < room[0][0].length; k++) {
                    room[i][j][k] = 0;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            b = scan.nextInt();
            f = scan.nextInt();
            r = scan.nextInt();
            v = scan.nextInt();

            room[b -1][f -1][r -1] += v;
        }

        for (int i = 0; i < room.length; i++) {
            for (int j = 0; j < room[0].length; j++) {
                for (int k = 0; k < room[0][0].length; k++) {
                    System.out.print(" " + room[i][j][k]);
                }
                System.out.println();
            }
            if (i < room.length -1) {
                for (int a = 0; a < 20; a ++) {
                    System.out.print("#");
                }
                System.out.println();
            }
        }

    }
}