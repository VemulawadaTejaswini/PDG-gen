
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);       // TODO 自動生成されたメソッド・スタブ
        int n = sc.nextInt();
        int[] h = new int[n];
        for (int i = 0 ; i < n ; i++) {
            h[i] = sc.nextInt();
        }
        int cnt = 0;
        int max = 0;

        for (int i = 0 ; i < n ; i++) {
            if (h[i] >= max) {
                cnt++;
            }
            max = Math.max(max, h[i]);
        }
        System.out.println(cnt);

    }

}
