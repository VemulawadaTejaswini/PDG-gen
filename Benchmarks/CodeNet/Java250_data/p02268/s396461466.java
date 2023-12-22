import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Set<Integer> s = new HashSet<>(), t = new HashSet<>();
        for (int i = 0; i < n; i++) {
            s.add(in.nextInt());
        }
        n = in.nextInt();
        for (int i = 0; i < n; i++) {
            t.add(in.nextInt());
        }
        s.retainAll(t);
        System.out.println(s.size());
    }
}