import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 1;
        int x;
        while ((x = sc.nextInt()) != 0) {
            System.out.printf("Case %d: %d\n", i++, x);
        }
    }
}