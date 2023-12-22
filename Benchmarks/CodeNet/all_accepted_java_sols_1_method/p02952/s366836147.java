import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int ans = N;
        int che = 0;
        for (int i = 1; i < (N + 1); i++) {
            che = String.valueOf(i).length();
            if (che % 2 == 0) {
                ans--;
            }
        }
            System.out.print(ans);
    }
}
