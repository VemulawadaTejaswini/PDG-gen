import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {
    static int[] order;

    static void bubble(int i, int j) {
        if (i < j) {
            return;
        }

        int tmp = order[i];
        for (int x = i; x > j; x--) {
            order[x] = order[x - 1];
        }
        order[j] = tmp;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int m = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());

        order = new int[m];
        for (int i = 0; i < m; i++) {
            order[i] = i + 1;
        }

        int a = 0;
        int b = 0;
        int posA = 0;
        int posB = 0;

        for (int i = 0; i < n; i++) {
            String[] input = br.readLine().split(" ");
            a = Integer.parseInt(input[0]);
            b = Integer.parseInt(input[1]);
            // 配列を走査、入れ替えの必要性を判断
            for (int j = 0; j < m; j++) {
                if (order[j] == a)
                    posA = j;
                if (order[j] == b)
                    posB = j;
            }
            bubble(posA, posB);
        }

        // display
        for (int x : order) {
            System.out.println(x);
        }
    }
}
