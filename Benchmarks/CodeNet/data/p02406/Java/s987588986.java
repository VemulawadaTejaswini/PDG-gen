import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x;
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0) System.out.printf(" %d", i);
            else if (i >= 10) {
                x = i;
                while (x != 0) {
                    if (x % 10 == 3) System.out.printf(" %d", i);
                    x /= 10;
                }
            }
        }
        System.out.printf("\n");
    }
}