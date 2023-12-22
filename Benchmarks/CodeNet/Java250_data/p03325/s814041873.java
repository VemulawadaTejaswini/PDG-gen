import java.util.*;

public class Main {
    public void main(Scanner sc) {
        int n = sc.nextInt();
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            while (a % 2 == 0) {
                a /= 2;
                cnt++;
            }
        }

        System.out.println(cnt);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        new Main().main(sc);
        sc.close();
    }
}
