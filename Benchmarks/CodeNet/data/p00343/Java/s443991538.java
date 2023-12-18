import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n-- > 0) {
            boolean[] used = new boolean[14];
            boolean ans = false;
            for (int i = 0; i < 6; i++) {
                used[sc.nextInt()] = true;
            }
            if (used[1] == used[13])
                ans = !used[1];
            else {
                int[] r = { 6, 8 };
                boolean t = false;
                for (;;) {
                    int a = t == used[1] ? 1 : 0;
                    int b = (a + 1) % 2;
                    if (used[r[a]] ^ t)
                        r[a] += a == 1 ? 1 : -1;
                    else if (used[r[b]] ^ t)
                        r[b] += b == 1 ? 1 : -1;
                    if (r[1] == 13 || r[0] == 1) {
                        ans = used[1] ^ r[1] == 13;
                        break;
                    }
                    t = !t;
                }
            }
            System.out.println(ans ? "yes" : "no");
        }
    }
}
