import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        Set<String> set = new HashSet<String>();
        for (long l = 0; l < n; l++) {
            set.add(sc.next());
        }
        sc.close();
        System.out.println(set.size());
    }
}
