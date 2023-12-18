import java.util.*;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int N = Integer.parseInt(sc.next());
            List<Integer> a = new ArrayList<>();
            long sum = 0;
            for (int i = 0; i < N; i++) {
                int input = Integer.parseInt(sc.next());
                a.add(input);
                sum += input;
            }
            int Q = Integer.parseInt(sc.next());
            for (int i = 0; i < Q; i++) {
                Collections.sort(a);
                int b = Integer.parseInt(sc.next());
                int c = Integer.parseInt(sc.next());
                int cnt = 0;

                int index = a.indexOf(b);
                if (index != -1) {
                    for (int j = index; j < N; j++) {
                        if (a.get(j) > b) break;
                        if (a.get(j) == b) {
                            a.set(j, c);
                            cnt++;
                        }
                    }
                }

                if (cnt > 0) {
                    sum += (c - b) * cnt;
                }
                System.out.println(sum);
            }
        }
    }
}