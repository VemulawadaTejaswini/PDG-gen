import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int ans = 1000000000;

        for (int i = 0; i <= N ; i ++) {
            //iを6^pで表現
            int count = 0;
            int t = i;
            while (t > 0) {
                count += t % 6;
                t /= 6;
            }
            int u = N - i;
            while (u > 0) {
                count += u % 9;
                u /= 9;
            }
            ans = Math.min(count, ans);
        }
        System.out.println(ans);
    }

}