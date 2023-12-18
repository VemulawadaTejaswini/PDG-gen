
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int[] l = new int[n];
        for (int i = 0 ; i < n ; i++) {
            l[i] = sc.nextInt();
        }
        int[] d = new int[n + 1];
        for (int i = 1 ; i < n + 1 ; i++ ) {
            d[i] = d[i - 1] + l[i - 1];
            if (d[i] > x) {
                System.out.println(i);
                return;
            }
        }
        System.out.println(n + 1);
    }

}
