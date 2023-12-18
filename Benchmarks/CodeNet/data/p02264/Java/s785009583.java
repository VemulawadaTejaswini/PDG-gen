import java.util.Scanner;

class Main {
    static int n;
    static int q;
    static int head;
    static int tail;
    static Process[] a;
    static int elaps;

    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        q = sc.nextInt();
        a = new Process[n + 1];

        for (int i = 0; i < n; i++) {
            a[i] = new Process(sc.next(), sc.nextInt());
        }

        head = 0;
        tail = n;

        while(head != tail) {
            Process p = dequeue();
            int time = getMin(p.time, q);
            p.time -= time;
            elaps += time;
            if (p.time > 0) {
                enqueue(p);
            } else {
                System.out.printf("%s %d\n", p.name, elaps);
            }
        }
    }

    public static Process dequeue() {
        Process p = a[head];
        head = (head + 1) % (n + 1);
        return p;
    }

    public static void enqueue(Process p) {
        a[tail] = p;
        tail = (tail + 1) % (n + 1);
    }

    public static int getMin(int a, int b) {
        if (a > b) {
            return b;
        }
        return a;
    }
}

class Process {
    String name;
    int time;
    public Process(String name, int time) {
        this.name = name;
        this.time = time;
    }
}

