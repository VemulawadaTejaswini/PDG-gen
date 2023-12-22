import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        Map<String, Integer> map = new HashMap<>();

        for (int i=0; i<N; i++) {
            String s = sc.next();
            map.put(s, map.getOrDefault(s, 0) + 1);
        }

        int M = sc.nextInt();
        for (int i=0; i<M; i++) {
            String s = sc.next();
            map.put(s, map.getOrDefault(s, 0) - 1);
        }

        int max = 0;
        for (String s : map.keySet()) {
            max = max > map.get(s) ? max : map.get(s);
        }
        System.out.println(max);
    }
}

