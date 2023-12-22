import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        Set<Integer> st = new TreeSet<>();
        for(int i = 0; i < n; ++i) {
            int x = s.nextInt();
            st.add(x);
        }
        System.out.println(st.size());
    }
}
