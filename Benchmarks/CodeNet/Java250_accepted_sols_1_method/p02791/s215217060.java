import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] P = new int[N];

        for (int i = 0; i < N; i++) {
            P[i] = sc.nextInt();
        }

        int ans = 0;
        int min = 9999999;

        for (int i = 0; i < N; i++) {
            if(min > P[i]){
                min = P[i];
                ans++;
            }
        }

        System.out.println(ans);

    }
}

