import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] a = new int[100][2];

        int i;

        for (i = 0;; i++) {
            a[i][0] = sc.nextInt();
            a[i][1] = sc.nextInt();

            if (a[i][0] == 0 && a[i][0] == 0) {
                break;
            }
        }

        for (int l = 0; l < i; l++) {
            for (int k = 0; k < a[l][0]; k++) {
                for (int j = 0; j < a[l][1]; j++) {
                    System.out.print("#");
                }
                System.out.print("\n");
            }
            System.out.print("\n");
        }

        sc.close();
    }
}
