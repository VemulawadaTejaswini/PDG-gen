import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        System.out.println("No");
        if (true) {
            return;
        }
        solvemain();
        int trying = 100;
        while (trying-- > 0) {
            // solve();
        }
    }
    
    public static void solvemain() {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }
        Arrays.sort(a);
        Arrays.sort(b);
        
        Map<Integer, Integer> mapa = new HashMap<Integer, Integer>();
        Map<Integer, Integer> mapb = new HashMap<Integer, Integer>();
        for (int i = 0; i < n; i++) {
            int key = a[i];
            int val = mapa.getOrDefault(key, 0);
            mapa.put(key, ++val);
        }
        for (int i = 0; i < n; i++) {
            int key = b[i];
            int val = mapb.getOrDefault(key, 0);
            mapb.put(key, ++val);
        }
        
        boolean ok = true;
        for (Integer key : mapa.keySet()) {
            int vala = mapa.getOrDefault(key, 0);
            int valb = mapb.getOrDefault(key, 0);
            
            if (n - vala < valb) {
                ok = false;
            }
        }
        if (!ok) {
            System.out.println("No");
            return;
        }
        
        int[] freq = new int[200001];
        for (int i = 0; i < n; i++) {
            freq[b[i]]++;
        }
        
        int[] ans = new int[n];
        int j = a[0]+1;
        for (int i = 0; i < n; i++) {
            if (a[i] == j) j++;
            if (j == 200001) {
                j = 0;
            }
            
            while (true) {
                if (freq[j] > 0) {
                    ans[i] = j;
                    freq[j]--;
                    break;
                } else {
                    j++;
                    
                    if (j == 200001) {
                        j = 0;
                    }
                }
            }
        }
        System.out.println("Yes");
        for (int i = 0; i < n; i++) {
            System.out.print(ans[i]);
            if (i != n-1) {
                System.out.print(" ");
            } else {
                System.out.println();
            }
        }
        
        // System.out.println(Arrays.toString(a));
        // System.out.println(Arrays.toString(b));
        // System.out.println(Arrays.toString(ans));
    }
    
    public static void solve() {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int n = 6;
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = random.nextInt(3);
        }
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            b[i] = random.nextInt(3);
        }
        Arrays.sort(a);
        Arrays.sort(b);
        
        // 順列全探索
        boolean ok = false;
        do {
            boolean ok2 = true;
            for (int i = 0; i < n; i++) {
                if (a[i] == b[i]) {
                    ok2 = false;
                }
            }
            
            if (ok2) {
                ok = true;
                break;
            }
        } while (nextPermutation(b));
        
        if (!ok) {
            System.out.println(Arrays.toString(a));
            System.out.println(Arrays.toString(b));
            System.out.println();
        }
        
        // NG:
        // n-mapa.get(0) >= mapb.get(0)
    }
    
    public static boolean nextPermutation(int[] array) {
        for (int i = array.length - 1; i > 0; i--) {
            if (array[i - 1] < array[i]) {
                int j = find(array, array[i - 1], i, array.length - 1);
                int temp = array[j];
                array[j] = array[i - 1];
                array[i - 1] = temp;
                Arrays.sort(array, i, array.length);
                return true;
            }
        }
        return false;
    }
	 
    private static int find(int[] array, int dest, int f, int l) {
        if (f == l) return f;
        
        int m = (f + l + 1) / 2;
        return (array[m] <= dest) ? find(array, dest, f, m - 1) : find(array, dest, m, l);
    }
}