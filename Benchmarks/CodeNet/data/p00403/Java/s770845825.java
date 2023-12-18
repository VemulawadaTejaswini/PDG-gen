import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashSet<Integer> inside = new HashSet<>();
        ArrayDeque<Integer> deq = new ArrayDeque<>();
        for (int i =  1; i <= n; i++) {
            int x = sc.nextInt();
            if (x > 0) {
                if (inside.contains(x)) {
                    System.out.println(i);
                    return;
                }
                inside.add(x);
                deq.push(x);
            } else {
                x *= -1;
                if (deq.size() == 0 || deq.pop() != x) {
                    System.out.println(i);
                    return;
                }
                inside.remove(x);
            }
        }
        System.out.println("OK");
    }
}
