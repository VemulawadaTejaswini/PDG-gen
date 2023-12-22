import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int i=0; i<N; i++) {
            int a = sc.nextInt();
            map.put(a, map.getOrDefault(a, 0) + 1);
        }

        if (map.size() <= K) {
            System.out.println(0);
            return;
        }

        List<Integer> list = new ArrayList<>(map.values());
        list.sort((Integer a, Integer b) -> a - b);
        int sum = 0;
        for (int i=0; i<map.size() - K; i++) {
            sum += list.get(i);
        }
        System.out.println(sum);

    }
}

