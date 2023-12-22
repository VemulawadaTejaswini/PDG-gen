import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char s[] = sc.next().toCharArray();
        sc.close();
        Deque<Integer> q = new ArrayDeque<>();
        for (char x : s) {
            if (q.isEmpty()) {
                if (x != 'B') {
                    q.add(x - 48);
                }
            } else if (x == 'B') {
                q.pollLast();
            } else {
                q.add(x - 48);
            }
        }
        for (int i : q) {
            System.out.print(i);
        }
        System.out.println();
    }
}