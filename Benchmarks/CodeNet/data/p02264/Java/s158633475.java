import java.util.*;

class Queue {
    static int top = 0;
    static int time = 0;
    static int n, q;
    static String[] label;
    static int[] value;
    public static void main() {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt()-1;
        q = sc.nextInt();
        label = new String[1000000];
        value = new int[1000000];
        for (int i = 0; i <= n; i++) {
            label[i] = sc.next();
            value[i] = sc.nextInt();
        }
        sc.close();
        process();   
    }

    static void process() {
        while (top <= n) {
            int topItem = pop();
            if (topItem <= q) {
                time += topItem;
                System.out.println(label[top-1] + " " + time);
            } else {
                time += q;
                push(topItem - q);
            }
        }
    }
    
    static int pop() {
        return value[top++];
    }

    static void push(int x) {
        label[++n] = label[top-1];
        value[n] = x;
    }
}

public class Main {
    public static void main(String[] args) {
        Queue que = new Queue();
        que.main();
    }
}
