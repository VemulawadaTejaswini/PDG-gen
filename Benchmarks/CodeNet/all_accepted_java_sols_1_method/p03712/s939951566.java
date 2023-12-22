import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();
        String [][] a = new String [H+2][W+2];
        for (int i = 0 ; i < H + 2 ; i++ ) {
            for (int j = 0 ; j < W + 2 ; j++ ) {
                a[i][j] = "#";
            }
        }
        for (int i = 1 ; i <= H ; i++ ) {
            String s = sc.next();
            for (int j = 1 ; j <= W ; j++) {
                a[i][j] = String.valueOf(s.charAt(j - 1));
            }
        }

        for (int i = 0 ; i < H + 2 ; i++ ) {
            for (int j = 0 ; j < W + 2 ; j++ ) {
                System.out.print(a[i][j]);
            }
            System.out.println("");
        }
    }

}