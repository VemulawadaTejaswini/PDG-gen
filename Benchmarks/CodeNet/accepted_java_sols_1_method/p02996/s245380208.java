import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Map<Integer, Integer> AB = new TreeMap<>();
        String answer = "";
        int lastB = 0;

        for (int i = 0; i < N; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            if (AB.containsKey(B)) {
                AB.put(B, AB.get(B) + A);
            } else {
                AB.put(B, A);
            }
            if (i == N - 1) {
                lastB = B;
            }
        }

        long sum = 0;
        for (Map.Entry<Integer, Integer> ab : AB.entrySet()) {
            sum = sum + ab.getValue();
            if (ab.getKey() < sum) {
                answer = "No";
                break;
            }
            if (lastB == ab.getKey()) {
                answer = "Yes";
            }
        }

        System.out.println(answer);
        sc.close();
    }
}