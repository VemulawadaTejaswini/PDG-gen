import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Deque<String> a = new ArrayDeque<>();
        Deque<String> b = new ArrayDeque<>();
        Deque<String> c = new ArrayDeque<>();
        String s = sc.next();
        for (int i = 0; i < s.length(); i++) {
            a.add(s.substring(i, i + 1));
        }
        s = sc.next();
        for (int i = 0; i < s.length(); i++) {
            b.add(s.substring(i, i + 1));
        }
        s = sc.next();
        for (int i = 0; i < s.length(); i++) {
            c.add(s.substring(i, i + 1));
        }
        sc.close();
        String card = a.poll();
        while (true) {
            if ("a".equals(card)) {
                if (a.size() == 0) {
                    System.out.println("A");
                    return;
                }
                card = a.poll();
            } else if ("b".equals(card)) {
                if (b.size() == 0) {
                    System.out.println("B");
                    return;
                }
                card = b.poll();
            } else {
                if (c.size() == 0) {
                    System.out.println("C");
                    return;
                }
                card = c.poll();
            }
        }
    }
}