import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        solvemain();
        int trying = 100;
        while (trying-- > 0) {
            // solvemain();
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
        
        boolean ok = true;
        int max = 0;
        int[] count = new int[200001];
        for (int i = 0; i < n; i++) {
            count[a[i]]++;
            count[b[i]]++;
        }
        for (int i = 0; i < 200001; i++) {
            max = Math.max(max, count[i]);
        }
        if (max > n) ok = false;
        
        if (!ok) {
            System.out.println("No");
            return;
        }
        
        int[] ans = new int[n];
        int offset = 0;
        while (true) {
            for (int i = 0; i < n; i++) {
                ans[i] = b[i+offset];
            }
            
            boolean ok2 = true;
            for (int i = 0; i < n; i++) {
                if (ans[i] == b[i]) {
                    ok = false;
                    break;
                }
            }
            
            if (ok2) {
                break;
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
        
        if (ok) {
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