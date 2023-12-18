
// import java.io.*;
// import java.math.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        Queue<Integer> q = new PriorityQueue<Integer>(Collections.reverseOrder());
        for (int i = 0; i < N; i++) {
            q.add(sc.nextInt());
        }
        for (int i = 0; i < M; i++) {
            q.add(q.poll() / 2);
        }
        long result = 0L;
        for (int x : q) {
            result += x;
        }
        System.out.println(result);
    }
}