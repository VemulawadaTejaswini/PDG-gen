import java.util.*;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] Az = new int[N];
        for (int i = 0; i < N; i++) {
            Az[i] = sc.nextInt();
        }
        HashSet<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < N; i++) {
            set.add(Az[i]);
        }
        if (set.size() == N){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
