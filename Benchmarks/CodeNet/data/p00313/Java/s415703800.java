import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        boolean[] inA = new boolean[n];
        for (int i = 0; i < x; i++) {
            int a = sc.nextInt() - 1;
            inA[a] = true;
        }
        int y = sc.nextInt();
        boolean[] inB = new boolean[n];
        for (int i = 0; i < y; i++) {
            int b = sc.nextInt() - 1;
            inB[b] = true;
        }
        int z = sc.nextInt();
        boolean[] hasC = new boolean[n];
        for (int i = 0; i < z; i++) {
            int c = sc.nextInt() - 1;
            hasC[c] = true;
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            if(!inA[i] && hasC[i]) {
                ans++;
                continue;
            } else if(inB[i] && hasC[i]) {
                ans++;
                continue;
            }
        }
        System.out.println(ans);
    }
}
