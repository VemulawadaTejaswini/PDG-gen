import java.util.*;


public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String S = sc.next();
        List<Integer> R = new ArrayList<>();
        List<Integer> G = new ArrayList<>();
        Set<Integer> B = new HashSet<>();
        for (int i = 0; i < N; i++) {
            char c = S.charAt(i);
            if (c == 'R') R.add(i+1);
            if (c == 'G') G.add(i+1);
            if (c == 'B') B.add(i+1);
        }

        long ans = 0;
        for (int i = 0; i < R.size(); i++) {
            for (int j = 0; j < G.size(); j++) {
                int r = R.get(i);
                int g = G.get(j);
                int diff = Math.abs(r-g);
                int left = Math.min(r,g);
                int right = Math.max(r,g);
                ans += B.size();
                if (diff%2 == 0 && B.contains(left+diff/2)) ans--;
                if (B.contains(right+diff)) ans--;
                if (B.contains(left-diff)) ans--;
            }
        }
        System.out.println(ans);
    }
}
