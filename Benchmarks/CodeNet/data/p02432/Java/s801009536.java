import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        Deque dq = new Deque();
        int q = Integer.parseInt(sc.next());
        for (int i = 1; i <= q; i++) {
            int query = Integer.parseInt(sc.next());
            switch (query) {
                case 0 : 
                    int a = Integer.parseInt(sc.next());
                    int x = Integer.parseInt(sc.next());
                    if (a == 0)
                        dq.pushHead(x);
                    else
                        dq.pushTail(x);
                    break;
                case 1 :
                    int p = Integer.parseInt(sc.next());
                    pw.println(dq.ar[dq.head+p+1]);
                    break;
                case 2 :
                    int d = Integer.parseInt(sc.next());
                    if (d == 0)
                        dq.popHead();
                    else
                        dq.popTail();
                    break;
                default:
                    break;
            }
        }
        pw.flush();
    }
}

class Deque {
    int[] ar;
    int head = 500000;
    int tail = 500001;
    Deque() {
        ar = new int[1000000];
    }
    void pushHead(int x) {
        this.ar[head] = x;
        this.head--; 
    }
    void pushTail(int x) {
        this.ar[tail] = x;
        this.tail++;
    }
    void popHead() {
        this.head++;
    }
    void popTail() {
        this.tail--;
    }
}
