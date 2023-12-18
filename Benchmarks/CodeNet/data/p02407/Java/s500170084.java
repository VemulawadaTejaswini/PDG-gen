
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] deta = new int[n];

        for (int i = 0; i < n; i++) {
            deta[i] = sc.nextInt();
        }
        for (int i = n - 1; i > 0; i--) {
            System.out.print(deta[i] + " ");
        }
        System.out.println(deta[0]);
    }
}

