import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int x = sc.nextInt();
        int a = 0;

        int cntL = 0;
        int cntR = 0;

        for (int i = 0; i < m; i++) {
            a = sc.nextInt();
            if (a < x)
                cntL++;
            else if (a < n)
                cntR++;
        }

        System.out.print(Math.min(cntL, cntR));
    }
}
