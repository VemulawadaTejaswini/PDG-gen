import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        Map<Integer, Set<Integer>> doukutsu = new HashMap<>();

        for (int i=0;i<m;i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            Set<Integer> mitch = new HashSet<>();
            if (doukutsu.containsKey(a)) {
                mitch = doukutsu.get(a);
            }
            mitch.add(b);
            doukutsu.put(a,mitch);

            Set<Integer> mitch2 = new HashSet<>();
            if (doukutsu.containsKey(b)) {
                mitch2 = doukutsu.get(b);
            }
            mitch2.add(a);
            doukutsu.put(b,mitch2);
        }
        Map<Integer, Integer> ans = new HashMap<>();
        Set<Integer> next = new HashSet<>();
        next.add(1);

        while (!next.isEmpty()) {
            Set<Integer> next2 = new HashSet<>();
            for (Integer nInt : next) {
                Set<Integer> root = doukutsu.get(nInt);
                for (Integer rInt : root) {
                    if (!ans.containsKey(rInt) && rInt != 1) {
                        ans.put(rInt, nInt);
                        next2.add(rInt);
                    }
                }
            }
            next = next2;
        }

        if (ans.size() < (n-1)) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
            for (int i = 2;i<=n;i++) {
                System.out.println(ans.get(i));
            }
        }

    }
}
