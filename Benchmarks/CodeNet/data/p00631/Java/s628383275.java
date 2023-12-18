import java.util.*;

public class Main {
    
    static int n;
    static int[] a = new int[21];
    
    static int dfs(int A, int B, int i) {
        int x;
        int y;
        if(i == n) return Math.abs(A-B);
        x = dfs(A+a[i], B, i+1);
        y = dfs(A, B+a[i], i+1);
        return Math.min(x, y);
    }
    
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            while(sc.hasNext())｛
                n = sc.nextInt();
                if(n == 0) break;
                for(int i=0; i<n; i++) {
                    a[i] = sc.nextInt();
                }
                System.out.println(dfs(0, 0, 0));
            ｝
        }
    }
}

