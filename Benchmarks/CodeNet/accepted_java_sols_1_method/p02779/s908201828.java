import java.util.*;

public class Main {
    public static void main(String[] args) {
        int N;
        int[] Ai = null;
        try (Scanner sc = new Scanner(System.in)) {
            N = sc.nextInt();
            Ai = new int[N];
            for (int i = 0; i < N; i++) {
                Ai[i] = sc.nextInt();
            }
        }

        Set<Integer> set = new TreeSet<>();
        for(int i : Ai){
            if(!set.add(i)){
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
}
