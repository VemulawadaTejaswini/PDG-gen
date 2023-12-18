import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = in.nextInt();
        for (int i = 0; i < 105; i++) {
            boolean poss = true;
            for (int j = 0; j < n; j++) {
                if (arr[j] == x - i) {
                    poss = false;
                }
            }
            if (poss) {
                System.out.println(x - i);
                return;
            }
            poss = true;
            for (int j = 0; j < n; j++) {
                if (arr[j] == x + i) {
                    poss = false;
                }
            }
            if (poss) {
                System.out.println(x + i);
                return;
            }
        }
    }
}
