import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int N = cin.nextInt();
        int[] d = new int[N];
        for (int i = 0; i < N; i++) {
            d[i] = cin.nextInt();
        }

        Set<Integer> s = new HashSet<>();
        for (int i = 0; i < N; i++) {
            s.add(d[i]);
        }

        System.out.println(s.size());
    }
}
