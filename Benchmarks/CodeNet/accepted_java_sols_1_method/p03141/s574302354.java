import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  N = sc.nextInt();
        long[][] s = new long[N][3];
        for(int i = 0; i < N; i++){
            s[i][0] = sc.nextLong();
            s[i][1] = sc.nextLong();
            s[i][2] = s[i][0] + s[i][1];
        }
        Arrays.sort(s, (x, y) -> Long.compare(y[2], x[2]));
        long ans = 0;
        for(int i = 0; i < N; i++){
            if(i % 2 == 0) ans += s[i][0];
            else ans -= s[i][1];
        }

        System.out.println(ans);
        sc.close();
    }

}
