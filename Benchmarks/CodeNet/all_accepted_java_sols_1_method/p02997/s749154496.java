import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        if (n * (n - 1) / 2 - (n - 1) < k) {
            System.out.println(-1);
            return;
        }

        ArrayList<String> buf = new ArrayList<String>();
        int num = (n - 2) * (n - 1) / 2;
        for (int i = 1; i < n; ++i) {
            buf.add(String.format("%d %d", 1, i + 1));
        }

        for (int i = 1; i < n; ++i) {
            boolean done = false;
            for (int j = i + 1; j < n; ++j) {
                if (num == k) {
                    done = true;
                    break;
                }
                buf.add(String.format("%d %d", i + 1, j + 1));
                num--;
            }
            if (done) {
                break;
            }
        }

        System.out.println(buf.size());
        for (String b: buf) {
            System.out.println(b);
        }
    }
}
