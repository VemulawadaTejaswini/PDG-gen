import java.io.*;
import java.util.*;

class Range {
    public int from, to;
    public int color;
    Range(int from, int to, int color) {
        this.from = from;
        this.to = to;
        this.color = color;
    }
}

public class Main {
    Scanner sc;
    Stack<Range> stack;
    int n;

    Main() {
        sc = new Scanner(System.in);
    }

    public static void main(String[] args) {
        new Main().run();
    }

    boolean init() {
        n = sc.nextInt();
        if (n == 0) return false;
        stack = new Stack<Range>();
        stack.push(new Range(0, 0, 0));
        return true;
    }

    void run() {
        while (init()) {
            int color;
            for (int i = 1; i <= n; i++) {
                color = sc.nextInt();
                if (i % 2 == 1) {
                    if (stack.peek().color == color) {
                        stack.peek().to++;
                    } else {
                        stack.push(new Range(i, i+1, color));
                    }
                } else {
                    if (stack.peek().color == color) {
                        stack.peek().to++;
                    } else {
                        stack.peek().color = color;
                        stack.peek().to++;
                    }
                }
            }
            int count = 0;
            for (Range r : stack) {
                if (r.color == 0) {
                    count += (r.to - r.from);
                }
            }

            System.out.println(count);
        }
    }
}