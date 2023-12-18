import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        boolean b[] = new boolean[150];
        b[4] = b[7] = true;
        for (int i = 0; i <= 100; i++) {
            if (b[i]) {
                b[i + 4] = b[i + 7] = true;
            }
        }
        System.out.println(b[N] ? "Yes" : "No");
    }
}
