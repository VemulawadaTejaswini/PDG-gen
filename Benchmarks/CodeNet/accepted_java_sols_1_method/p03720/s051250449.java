import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] cites = new int[N];
        Map<Integer, Integer> map = new HashMap<>();

        for (int i=1; i<N+1; i++) {
            map.put(i, 0);
        }
        for (int i=0; i<M; i++) {
            int ai = sc.nextInt();
            map.put(ai, map.get(ai) + 1);
            int bi = sc.nextInt();
            map.put(bi, map.get(bi) + 1);
        }

        for (int i=1; i<N + 1; i++) {
            System.out.println(map.get(i));
        }
    }
}

