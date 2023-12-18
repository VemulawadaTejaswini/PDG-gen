import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String num = scan.nextLine();
        int n = Integer.parseInt(num.split(" ")[0]);
        int m = Integer.parseInt(num.split(" ")[1]);
        int j = 0;
        int[][] A = new int[n][m];
        String tmp;
        while (j < n) {
            tmp = scan.nextLine();
            for (int i = 0; i < m; i++) {
                A[j][i] = Integer.parseInt(tmp.split(" ")[i]);
                // System.out.println(Integer.parseInt(tmp.split(" ")[i]));
            }
            j++;
        }
        j = 0;
        int[] b = new int[m];
        while (j < m) {
            tmp = scan.nextLine();
            b[j] = Integer.parseInt(tmp);
            j++;
        }

        int[] sum = new int[n];

        for (int i = 0; i < n; i++) {
            for (int q = 0; q < m; q++) {
                sum[i] += A[i][q] * b[q];
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.println(sum[i]);
        }
    }

}

