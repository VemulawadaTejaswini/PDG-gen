import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Deque<Integer> deq = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            if(n % 2 != 0) {
                if(i % 2 == 0) {
                    deq.addFirst(sc.nextInt());
                } else {
                    deq.addLast(sc.nextInt());
                }
            } else {
                if(i % 2 == 0) {
                    deq.addLast(sc.nextInt());
                } else {
                    deq.addFirst(sc.nextInt());
                }
            }

        }
        for (int i : deq) {
            System.out.print(i + " ");
        }
    }
}