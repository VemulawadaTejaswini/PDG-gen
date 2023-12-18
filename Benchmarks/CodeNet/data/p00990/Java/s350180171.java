import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    Scanner sc = new Scanner(System.in);
    int INF = 1 << 28;

    void run() {
        int n = sc.nextInt();
        char[] id = new StringBuilder(sc.next()).reverse().toString()
                .toCharArray();
        int m = sc.nextInt();
        int as[] = new int[m];
        for (int i = 0; i < m; i++) {
            as[i] = sc.nextInt();
        }
        Queue<Node> q = new LinkedList<Node>();
        q.add(new Node(0, 0));
        int ans = 0;
        while (!q.isEmpty()) {
            Node nd = q.poll();
            int k = nd.k;
            int sum = nd.sum;
            if (k == n) {
                if (sum % 10 == 0) {
                    ans++;
                }
                continue;
            }
            if (id[k] != '*') {
                int num = id[k] - '0';
                if (k % 2 == 1)
                    num *= 2;
                q.add(new Node(k + 1, sum + num / 10 + num % 10));
                continue;
            }
            for (int i = 0; i < m; i++) {
                int num = as[i];
                if (k % 2 == 1)
                    num *= 2;
                q.add(new Node(k + 1, sum + num / 10 + num % 10));
            }
        }
        System.out.println(ans);
    }

    public static void main(String[] args) {
        new Main().run();
    }
}

class Node {
    int k;
    int sum;

    Node(int k, int sum) {
        this.k = k;
        this.sum = sum;
    }

    public String toString() {
        return "k : " + k + "  sum : " + sum;
    }
}