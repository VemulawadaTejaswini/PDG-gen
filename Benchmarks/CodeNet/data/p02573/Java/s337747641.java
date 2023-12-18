import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] fr = new int[N+1];
        Map<Integer,Set<Integer>> map = new HashMap<>();
        for (int i = 0; i < M; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            if (fr[A] != 0 || fr[B] != 0) {
                if (fr[A] != 0) {
                    if (fr[B] != 0) {
                        Set<Integer> set1 = map.get(A);
                        Set<Integer> set2 = map.get(B);
                        set1.addAll(set2);
                        set2.addAll(set1);
                    } else {
                        map.get(A).add(B);
                        Set<Integer> set = new HashSet<>();
                        set.addAll(map.get(A));
                        map.put(B, set);
                    }
                } else {
                    map.get(B).add(A);
                    Set<Integer> set = new HashSet<>();
                    set.addAll(map.get(B));
                    map.put(A, set);
                }

            } else {
                Set<Integer> set = new HashSet<>();
                set.add(A);
                set.add(B);
                map.put(A,set);
                map.put(B,set);
            }
            fr[A]++;
            fr[B]++;
        }
        long max = 0;
        for (Integer key : map.keySet()) {
            max = Math.max(max, map.get(key).size());
        }
        System.out.println(max);
    }    
}
