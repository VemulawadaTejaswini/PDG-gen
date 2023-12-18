import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] an = new int[n+1];
        for (int i = 1; i <= n; i++) {
            an[i] = sc.nextInt();
        }

        int j = an[1];
        for (int i = 1; i <= n; i++) {
            if (j == 2) {
                System.out.println(i);
                System.exit(0);
            }
            j = an[j];
        }
        System.out.println(-1);
    }

}