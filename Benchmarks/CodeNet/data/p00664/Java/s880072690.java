import java.util.Arrays;
import java.util.Scanner;

public class Main {
    void run() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int r = sc.nextInt();
            int c = sc.nextInt();
            int q = sc.nextInt();
            if ((r | c | q) == 0)
                break;
            int rs0[] = new int[r];
            int cs0[] = new int[c];
            int rs1[] = new int[r];
            int cs1[] = new int[c];
            for (int i = 1; i <= q; i++) {
                int a = sc.nextInt();
                int b = sc.nextInt();
                int ord = sc.nextInt();
                if (a == 0) {
                    if (ord == 0) {
                        rs0[b] = i;
                    } else {
                        rs1[b] = i;
                    }
                } else {
                    if (ord == 0) {
                        cs0[b] = i;
                    } else {
                        cs1[b] = i;
                    }
                }
            }
            int ans = 0;
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    if (rs1[i] > rs0[i] && rs1[i] > cs0[j] || cs1[j] > rs0[i]
                            && cs1[j] > cs0[j])
                        ans++;
                }
            }
            System.out.println(ans);
        }
    }

    public static void main(String[] args) throws Exception {
        new Main().run();
    }
}