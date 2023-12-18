import java.util.*;
import java.io.*;

public class Main {
    private static final int MAX_SIZE = 1000002;
    private static int key[]  = new int[MAX_SIZE];
    private static int prev[] = new int[MAX_SIZE];
    private static int next[] = new int[MAX_SIZE];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        init();

        int n = sc.nextInt();

        while (n-- > 0) {
            String cmd = sc.next();
            if (cmd.equals("insert"))
                insert(Integer.parseInt(sc.next()));
            else if (cmd.equals("delete"))
                delete(Integer.parseInt(sc.next()));
            else if (cmd.equals("deleteFirst"))
                deleteFirst();
            else
                deleteLast();
        }
        printKey();
    }
    private static void init() {
        for (int p = 1; p < next.length - 1; p++)
            next[p] = p + 1;
    }
    private static int newCell() {
        int p = next[1];
        next[1] = next[p];
        return p;
    }
    private static void putBack(int p) {
        next[p] = next[1];
        next[1] = p;
    }
    private static void destroy(int p) {
        prev[next[p]] = prev[p];
        next[prev[p]] = next[p];
        putBack(p);
    }
    private static void insert(int k) {
        int p = newCell();
        key[p] = k;
        prev[next[0]] = p;
        next[p] = next[0];
        next[0] = p;
        prev[p] = 0;
    }
    private static void delete(int k) {
        for (int p = next[0]; p != 0; p = next[p]) {
            if (key[p] == k) {
                destroy(p);
                break;
            }
        }
    }
    private static void deleteFirst() {
        destroy(next[0]);
    }
    private static void deleteLast() {
        destroy(prev[0]);
    }
    private static void printKey() {
        PrintWriter out = new PrintWriter(System.out);
        int first = next[0];
        for (int p = next[0]; p != 0; p = next[p]) {
            if (p != first)
                out.print(' ');
            out.print(key[p]);
        }
        out.println();
        out.flush();
    }
}

