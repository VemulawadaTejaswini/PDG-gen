import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] h = new int[n];
        for (int i = 0; i < n; i++) {
            h[i] = sc.nextInt();
        }
        int ans = 0;
        while(true) {
            boolean flg = true;
            int count = 0;
            for (int i = 0; i < n; i++) {
                if(h[i] != 0 && flg) {
                    ans++;
                    flg = false;
                } else if(h[i] == 0){
                    flg = true;
                    count++;
                }
                if(h[i] > 0) {
                    h[i]--;
                }
                if(count == n) {
                    System.out.println(ans);
                    return;
                }
            }
        }
    }
}