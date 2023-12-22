import java.util.*;

class Main {
    public static void main(String[] args) {
        new Solver().run();
    }
}

class Solver {

    private int count2(int v, Map<Integer, Integer> m) {
        if (v % 2 == 1) return 0;
        else if (m.containsKey(v)) return m.get(v);
        else {
            int ret = (count2(v/2, m) + 1);
            m.put(v, ret);
            return ret;
        }
    }

    public void run() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        Map<Integer, Integer> m = new HashMap<Integer, Integer>();
        m.put(1, 0);
        m.put(2, 1);

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < N; i++) {
            min = Math.min(min, count2(A[i], m));
        }

        System.out.println(min);

        return;
    }

}