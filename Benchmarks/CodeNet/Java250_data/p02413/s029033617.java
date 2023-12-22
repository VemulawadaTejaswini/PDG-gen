import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int r = sc.nextInt();
        int c = sc.nextInt();

        int ary[][] = new int[r + 1][c + 1];

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                ary[i][j] = Integer.valueOf(sc.next());
            }
        }

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                ary[i][c] += ary[i][j];
            }
        }
        for (int i = 0; i <= c; i++) {
            for (int j = 0; j < r; j++) {
                ary[r][i] += ary[j][i];
            }
        }

        for (int i = 0; i <= r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(ary[i][j]+" ");
                
            }
            System.out.println(ary[i][c]);
        }
    }
}