import java.util.Scanner;

public class Main {
    public int countWays(int n, int x) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < i; j++) {
                for (int k = 1; k < j; k++) {
                    if (i + j + k == x) {
//                        System.out.println(i + "+" + j + "+" + k);
                        count++;
                    }
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Main app = new Main();

        while (true) {
            int inN, inX;
            int count;

            inN = Integer.parseInt(scan.next());
            inX = Integer.parseInt(scan.next());
            if (inN == 0 && inX == 0) break;

            count = app.countWays(inN, inX);
            System.out.println(count);
        }
    }
}

