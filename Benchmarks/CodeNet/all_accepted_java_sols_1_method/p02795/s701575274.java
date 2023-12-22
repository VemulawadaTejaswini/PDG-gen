import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int h = sc.nextInt();
        int w = sc.nextInt();
        int n = sc.nextInt();

        int result = 0;
        int black = 0;
        int large = h;
        if (w > h) large = w;
        for (int i = 0; i < large; i++) {
            black += large;
            result++;
            if (black >= n) break;
        }

        System.out.println(result);
    }

}