import java.util.*;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        List<Integer> ans = new ArrayList<>();
        for(int t = 0; t < T; t++) {
            int N = scanner.nextInt();
            long[] A = new long[N];
            for(int i = 0; i < N; i++) {
                A[i] = scanner.nextLong();
            }
            String S = scanner.next();
            
            ans.add(doSomething(N, A, S.toCharArray()));
        }
        for(Integer a : ans) {
            System.out.println(a);
        }
    }

    private int doSomething(int n, long[] a, char[] s) {
        int x = 0;
        List<Long> arr1 = new ArrayList<>();
        List<Long> arr0 = new ArrayList<>();
        Map<Long, Integer> map = new HashMap<>();
        for(int i = 0; i < a.length; i++) {
            if(s[i] == '0') {
                arr0.add(a[i]);
            }else{
                arr1.add(a[i]);
            }
        }

        Set<Long> set = makeSet(new HashSet<>(), arr1, 0, 0);
        Set<Long> set2 = delSet(set, arr0, 0, 0);

        if(set2.size() > 0) {
            return 1;
        }else{
            return 0;
        }
    }

    private Set<Long> delSet(Set<Long> set, List<Long> arr0, long val, int i) {
        if(arr0.size() <= i) return null;
        long xor = val ^ arr0.get(i);
        set.remove(xor);
        set.remove(val);
        delSet(set, arr0, val, i+1);
        delSet(set, arr0, xor, i+1);
        return set;
    }

    private Set<Long> makeSet(Set<Long> set, List<Long> arr1, long val, int i) {
        if(arr1.size() <= i) return null;
        long xor = val ^ arr1.get(i);
        set.add(xor);
        set.add(val);
        makeSet(set, arr1, val, i+1);
        makeSet(set, arr1, xor, i+1);
        return set;
    }
}
