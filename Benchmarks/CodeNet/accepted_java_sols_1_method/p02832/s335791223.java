import java.util.*;

public class Main {
    static int MOD = 1000000007;
	static int INF = Integer.MAX_VALUE;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        Arrays.setAll(a, i -> sc.nextInt());
        sc.close();
        int res;
        int cnt = 0;
        int cntSame = 0;
        int i = 0;
        int j = 1;

        while (i < n) {
            if (a[i] == j) {
                cntSame++;
                i++;
                j++;
            } else if (a[i] != j){
                cnt++;
                i++;
            }
        }
        if (cntSame == n) {
            res = 0;
        } else if (cnt == n) {
            res = -1;
        } else {
            res = cnt;
        }
        System.out.println(res);
    }
}