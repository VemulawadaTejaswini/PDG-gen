import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int x;
        for (int i = 1; i <= n; i++) {
            x = i;
            if (checkNum(x, i)) continue;
            include3(x, i);
        }

        System.out.println("");

        sc.close();
    }

    static boolean checkNum(int x, int i) {
        if ((x % 3) != 0) return false;
        System.out.printf(" %d", i);
        return true;
    }

    static void include3(int x, int i) {
        if ((x % 10) == 3) {
            System.out.printf(" %d", i);
            return;
        }

        x /= 10;
        if (x != 0) include3(x, i);
    }
}
