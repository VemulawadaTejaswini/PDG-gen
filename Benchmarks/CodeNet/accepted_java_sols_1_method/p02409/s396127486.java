import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> A = new ArrayList<Integer>();

        int n = sc.nextInt();
        int[][][] B = new int[4][3][10];
        for (int i=0; i<4; i++) {
            for (int j=0; j<3; j++) {
                Arrays.fill(B[i][j], 0);
            }
        }

        for (int i=0; i<n; i++) {
            int b = sc.nextInt();
            int f = sc.nextInt();
            int r = sc.nextInt();
            int v = sc.nextInt();
            B[b-1][f-1][r-1] += v;
        }




        for (int i=0; i<4; i++) {
            for (int j=0; j<3; j++) {
                for (int k=0; k<10; k++) {
                    System.out.print(" ");
                    System.out.print(B[i][j][k]);
                }
                System.out.println();
            }
            if (i != 3) {
                for (int l = 0; l < 20; l++)
                    System.out.print("#");
                System.out.println();
            }
        }

    }
}
