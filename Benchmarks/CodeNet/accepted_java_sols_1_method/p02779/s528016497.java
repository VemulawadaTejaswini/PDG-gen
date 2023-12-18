import java.util.*;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = Integer.parseInt(sc.next());
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < n; ++i) {
            set.add(Integer.parseInt(sc.next()));
        }
        String ans = (set.size() == n) ? "YES" : "NO";
        System.out.println(ans);
    }
}