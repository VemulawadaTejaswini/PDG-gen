import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] ab = new int[n+1];
        for (int i = 0; i < m; i++) {
            ab[sc.nextInt()] += 1;
            ab[sc.nextInt()] += 1;
        }

        for (int i = 1; i <= n; i++) {
            System.out.println(ab[i]);
        }
    }

}