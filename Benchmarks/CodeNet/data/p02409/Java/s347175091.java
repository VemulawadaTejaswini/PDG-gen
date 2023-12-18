import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int data[][][] = new int [4][3][10];

        for(int i = 0; i < 4; i++) {
            for(int j = 0; j < 3; j++) {
                for(int k = 0; k < 10; k++) {
                    data[i][j][k] = 0;
                }
            }
        }

        for(int i = 0; i < n; i++) {
            int b = scan.nextInt();
            int f = scan.nextInt();
            int r = scan.nextInt();
            int v = scan.nextInt();

            data[b - 1][f - 1][r - 1] += v;
        }

        for(int i = 0; i < 4; i++) {
            for(int j = 0; j < 3; j++) {
                for(int k = 0; k < 10; k++) {
                    System.out.print(" " + data[i][j][k]);
                }
                System.out.print("\n");
            }
            if(i != 3) {
                System.out.print("####################\n");
            }
        }
    }
}
