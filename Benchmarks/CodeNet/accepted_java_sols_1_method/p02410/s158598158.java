import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int inN, inM;
        int[] vec;
        int[][] mat;
        int[] ans;
        Scanner scan = new Scanner(System.in);

        inN = Integer.parseInt(scan.next());
        inM = Integer.parseInt(scan.next());

        vec = new int[inM];
        ans = new int[inN];
        mat = new int[inN][inM];

        for (int i = 0; i < inN; i++) {
            for (int j = 0; j < inM; j++) {
                mat[i][j] = Integer.parseInt(scan.next());
            }
        }
        for (int i = 0; i < inM; i++) vec[i] = Integer.parseInt(scan.next());

        for (int i = 0; i < inN; i++) {
            int sum = 0;
            for (int j = 0; j < inM; j++) {
                sum += mat[i][j] * vec[j];
            }
            ans[i] = sum;
        }

        for (int i = 0; i < inN; i++) System.out.println(ans[i]);

    }
}

