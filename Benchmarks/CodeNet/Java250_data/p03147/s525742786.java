import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] h = new int[n];
        for (int i = 0; i < h.length; i++) {
            h[i] = sc.nextInt();
        }
        int ans = 0;
        while(true) {
            boolean flg = false;
            for (int i = 0; i < n; i++) {
                if(h[i] != 0) {
                    h[i]--;
                    flg = true;
                } else if(flg){
                    break;
                }
            }
            if(!flg) {
                break;
            }
            ans++;
        }
        System.out.println(ans);
    }
}