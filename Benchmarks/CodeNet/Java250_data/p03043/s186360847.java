import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = sc.nextInt();
        double ans = 0;
        for (int i = 1; i <= n; i++) {
            int cnt = 0;
            while (i * Math.pow(2, cnt) < k)
                cnt += 1;
            ans += (1/(double)n) * 1/Math.pow(2, cnt);
        }
        System.out.println(ans);
    }
}
