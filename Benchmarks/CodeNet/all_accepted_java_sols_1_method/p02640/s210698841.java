import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();
        int t = x * 4;

        boolean yes = false;

        for (int i = 0; i < x; i++) {
            if(t>y) t -= 2;
            if (y == t) {
                System.out.println("Yes");
                yes = true;
            }
            if (t <= y) break;
        }

        if (!yes) System.out.println("No");
    }
}