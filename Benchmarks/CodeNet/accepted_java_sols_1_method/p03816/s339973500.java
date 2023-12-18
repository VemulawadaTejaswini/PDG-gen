import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int cnt = 0;
        HashSet<Integer> set = new HashSet<Integer>();
        for (int i=0;i<N;i++) {
            int A = Integer.parseInt(sc.next());
            if (set.contains(A)) {
                cnt++;
            }
            set.add(A);
        }
        System.out.println(cnt%2==0?set.size():set.size()-1);
    }
}