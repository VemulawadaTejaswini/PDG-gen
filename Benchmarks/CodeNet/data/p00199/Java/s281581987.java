import java.io.*;
import java.util.*;

public class Main {
    void println(Object s) {
        System.out.println(s);
    }

    Scanner sc;
    int n, m;
    char chair[];
    static final int INF = 1<<28;

    Main() {
        sc = new Scanner(System.in);
    }

    boolean init() {
        n = sc.nextInt();
        m = sc.nextInt();
        if (n == 0 && m == 0) return false;
        chair = new char[n];
        return true;
    }

    void A() {
        for (int i = 0; i < n; i++) {
            if (chair[i] == 0) {
                chair[i] = 'A';
                return;
            }
        }
        System.err.println("ERROR in A");
    }

    void B() {
        int[] state = new int[n]; // 1: 埋まっている, 2: Aのとなり
        for (int i = 0; i < n; i++) 
            if (chair[i] != 0) 
                state[i] = 1;
        if (chair[0] == 'A' && state[1] == 0) state[1] = 2;
        for (int i = 1; i < n-1; i++) 
            if (chair[i] == 'A') {
                if (state[i-1] == 0) state[i-1] = 2;
                if (state[i+1] == 0) state[i+1] = 2;
            }
        if (chair[n-1] == 'A' && state[n-2] == 0) state[n-2] = 2;
        
        for (int i = n-1; i >= 0; i--) {
            if (state[i] == 0) {
                chair[i] = 'B';
                return;
            }
        }

        for (int i = 0; i < n; i++) 
            if (state[i] != 1) {
                chair[i] = 'B';
                return;
            }

        System.err.println("ERROR in B");
    }

    void C() {
        if (chair[0] != 0 && chair[1] == 0) {
            chair[1] = 'C';
            return;
        }
        for (int i = 1; i < n-1; i++) {
            if (chair[i] != 0) {
                if (chair[i+1] == 0) {
                    chair[i+1] = 'C';
                    return;
                }
                if (chair[i-1] == 0) {
                    chair[i-1] = 'C';
                    return;
                }
            }
        }
        if (chair[n-1] != 0 && chair[n-2] == 0) {
            chair[n-2] = 'C';
            return;
        }

        chair[n/2] = 'C';
    }
                
    void D() {
        int[] dist = new int[n];
        for (int i = 0; i < n; i++) {
            if (chair[i] != 0) {
                dist[i] = -1;
                continue;
            }
            for (int j = 1; j < n; j++) {
                if (i+j < n && chair[i+j] != 0) {
                    dist[i] = j;
                    continue;
                } else if (0 <= i-j && chair[i-j] != 0) {
                    dist[i] = j;
                    continue;
                }
            }
        }
        int max = 0;
        int index = 0;
        for (int i = 0; i < n; i++) {
            if (max < dist[i]) {
                max = dist[i];
                index = i;
            }
        }
        chair[index] = 'D';
    }

    void run() {
        while (init()) {
            char p;
            for (int i = 0; i < m; i++) {
                p = sc.next().charAt(0);
                switch (p) {
                    case 'A':
                        A();
                        break;
                    case 'B':
                        B();
                        break;
                    case 'C':
                        C();
                        break;
                    case 'D':
                        D();
                        break;
                }
            }
            for (int i = 0; i < n; i++) {
                if (chair[i] == 0) {
                    System.out.print("#");
                } else {
                    System.out.print(chair[i]);
                }
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        new Main().run();
    }
}