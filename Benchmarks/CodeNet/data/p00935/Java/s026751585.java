import java.util.Scanner;


public class Main {
    
    public static void main(String[] args) throws Exception {
        new Main().solve();
    }

    private void solve() throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ds = new int[n];
        for (int i = 0; i < n; i++) {
            ds[i] = sc.nextInt();
        }
        
        int MAX = 100000;
        int MAX_D = 5;
        boolean[] occured = new boolean[MAX];
        for (int i = 0; i < n; i++) {
            int s = 0;
            for (int j = i; j < i + MAX_D && j < n; j++) {
                s *= 10;
                s += ds[j];
                if (s < MAX) {
//                    if (!occured[s])System.out.println("v: " + s);
                    occured[s] = true;
                }
            }
        }
        
        for (int i = 0; i < MAX; i++) {
            if (!occured[i]) {
                System.out.println(i);
                return;
            }
        }
    }

}