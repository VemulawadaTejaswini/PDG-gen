import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] line = bufferedReader.readLine().split(" ");
        int N = Integer.parseInt(line[0]);
        int M = Integer.parseInt(line[1]);
        int capN = N * 4 / 3 + 1;
        int capM = M * 4 / 3 + 1;
        HashMap<Integer, HashSet> P = new HashMap<>(capN);
        for (int i = 2; i <= N; i++) P.put(i, new HashSet(capN));
        for (int i = 0; i < M; i++) {
            line = bufferedReader.readLine().split(" ");
            int a = Integer.parseInt(line[0]);
            int b = Integer.parseInt(line[1]);
            if (a != 1) P.get(a).add(b);
            if (b != 1) P.get(b).add(a);
        }
        HashMap<Integer, Integer> result = new HashMap<>(capN);
        HashSet<Integer> toward = new HashSet<>(capN);
        HashSet<Integer> nextToward = new HashSet<>(capN);
        HashSet<Integer> removeKey = new HashSet<>(capN);
        toward.add(1);
        while (true) {
            for (int key : P.keySet()) {
                HashSet p = P.get(key);
                for (int tK : toward) {
                    if (p.contains(tK)) {
                        result.put(key, tK);
                        removeKey.add(key);
                        nextToward.add(key);
                    }
                }
            }
            for (int key : removeKey) P.remove(key);
            removeKey.clear();
            if (nextToward.isEmpty()) break;
            toward.clear();
            toward.addAll(nextToward);
            nextToward.clear();
        }
        if (P.isEmpty()) {
            System.out.println("Yes");
            for (int i = 2; i <= N; i++) {
                System.out.println(result.get(i));
            }
        } else {
            System.out.println("No");
        }
    }

    static class Pair {
        int A;
        int B;

        public Pair(int a, int b) {
            A = a;
            B = b;
        }
    }
}
