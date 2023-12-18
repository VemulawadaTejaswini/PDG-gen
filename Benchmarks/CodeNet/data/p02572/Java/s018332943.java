import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

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
        List<List<Integer>> retarray = combination(elementlist, 2);
        for (int i = 0; i < retarray.size(); i++) {
            List<Integer> tempList = retarray.get(i);
            ans += a[tempList.get(0)] * a[tempList.get(1)] % MOD;
            ans %= MOD;
        }
        System.out.println(ans);
    }

    public static List<List<Integer>> combination(List list, int count) {
        List ret = new ArrayList<List<Integer>>();
        for (int i = 0; i < list.size(); i++) {
            if (i + count > list.size()) {
                break;
            }
            Stack stack = new Stack<Integer>();
            stack.push(list.get(i));
            _combination(ret, list, stack, i + 1, count);
        }
        return ret;
    }

    private static void _combination(List ret, List list, Stack stack, int index, int count) {
        for (int i = index; i < list.size(); i++) {
            stack.push(list.get(i));
            if (stack.size() == count) {
                ret.add(Arrays.asList(stack.toArray()));
                stack.pop();
                continue;
            }
            _combination(ret, list, stack, i + 1, count);
            stack.pop();
        }
    }
}