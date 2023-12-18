import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long[] Az = new long[N];
        for (int i = 0; i < N; i++) {
            Az[i] = sc.nextLong();
        }

        long ans = 0;
        long min = Az[0];
        for (int i = 1; i < N; i++) {
            if (min < Az[i]){
                min = Az[i];
            }
            if (min > Az[i]){

                ans += min - Az[i];
            }
        }

        System.out.println(ans);

    }
}