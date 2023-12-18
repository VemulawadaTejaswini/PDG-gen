import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    public static final int MOD = 1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = Long.parseLong(sc.next());
        }
        long ans = 0;
        List<Integer> elementlist = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            elementlist.add(i);
        }
        List<List<Integer>> retarray = make(elementlist, 2);
        for (int i = 0; i < retarray.size(); i++) {
            List<Integer> tempList = retarray.get(i);
            ans += a[tempList.get(0)] * a[tempList.get(1)] % MOD;
            ans %= MOD;
        }
        System.out.println(ans);
    }

    public static List<List<Integer>> make(List<Integer> candidate, int r) {
        if (candidate.size() < r || candidate.size() <= 0 || r <= 0) {
            List<List<Integer>> empty = new ArrayList<>();
            empty.add(new ArrayList<>());
            return empty;
        }

        List<List<Integer>> combination = new ArrayList<>();
        for (int i = 0; i <= candidate.size() - r; i++) {
            Integer picked = candidate.get(i);
            List<Integer> rest = new ArrayList<>(candidate);
            rest.subList(0, i + 1).clear();
            combination.addAll(make(rest, r - 1).stream().map(list -> {
                list.add(0, picked);
                return list;
            }).collect(Collectors.toList()));
        }
        return combination;
    }
}