import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[] a = new int[N];
        Map<Integer, Integer> valuesToCount = new HashMap<>();
        for (int i = 0; i < N; i++) {
            a[i] = sc.nextInt();
        }

        for (int i = 0; i < N; i++) {
            int value = a[i];
            if (valuesToCount.containsKey(value)) {
                valuesToCount.put(value, valuesToCount.get(value) + 1);
            } else {
                valuesToCount.put(value, 1);
            }
        }

        int ans = 0;
        for (Map.Entry<Integer, Integer> entry: valuesToCount.entrySet()) {
            int count = entry.getValue();
            int value = entry.getKey();
            if (count > value) {
                ans += count - value;
            } else if (value > count) {
                ans += count;
            }
        }

        System.out.println(ans);
    }
}