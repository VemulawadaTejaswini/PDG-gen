import java.util.Scanner;

class Pair {
    String name;
    int time;
}

public class Main {
    static int LEN;
    static int head;
    static int tail;
    static Pair[] pairs;

    // データの追加
    public static void enqueue(Pair x) {
        pairs[tail] = x;
        tail = (tail + 1) % LEN;
    }

    // データを取り出す
    public static Pair dequeue() {
        Pair x = pairs[head];
        head = (head + 1) % LEN;
        return x;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // n個のプロセス
        int q = sc.nextInt(); // 最大実行時間
        LEN = 100005;
        pairs = new Pair[LEN];
        for (int i = 1; i <= n; i++) {
            pairs[i] = new Pair();
            pairs[i].name = sc.next();
            pairs[i].time = sc.nextInt();
        }
        head = 1;
        tail = n + 1;
        int now = 0;
        while (tail != head) {
            Pair u = dequeue();
            if (u.time - q > 0) {
                now += q;
                u.time = u.time - q;
                enqueue(u);
            } else {
                now += u.time;
                System.out.println(u.name + " " + now);
            }
        }
        sc.close();
    }

}
