import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int d = sc.nextInt();
        int x = sc.nextInt();
        sc.close();

        int[] years = new int[10];
        years[0] = x;

        for (int i = 1; i <= 10; i++) {
            int xx = r * years[i - 1] - d;
            System.out.println(xx);
            if (i != 10) {
                years[i] = xx;
            }
        }
    }
}
