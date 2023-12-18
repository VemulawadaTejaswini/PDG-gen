import java.util.Scanner;

class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        byte n = sc.nextByte();
        byte m = sc.nextByte();
        int[][] mat = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        int[] vector = new int[m];
        for (int i = 0; i < m; i++) {
            vector[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            int a = 0;
            for (int j = 0; j < m; j++) {
                a += mat[i][j] * vector[j];
            }
            System.out.println(a);
        }



    }

}
