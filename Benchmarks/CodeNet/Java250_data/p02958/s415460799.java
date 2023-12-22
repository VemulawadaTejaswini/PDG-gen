
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] p = new int[n];
        for (int i = 0 ; i < n ; i++) {
            p[i] = sc.nextInt();
        }
        int c = 0;
        for (int i = 0 ; i < n ; i++) {
            if (p[i] != i + 1) c++;
        }

        if (c > 2) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }

    }

}
