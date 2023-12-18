import java.util.Scanner;

/**
 * Created by Reopard on 2014/05/13.
 */
public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String args[]) {
        int N, tmp, count;
        while (true) {
            N = sc.nextInt();
            count = 0;
            if (N == 0) break;
            for(int i = 1; i <= N/2; i++) {
                tmp = 0;
                for(int j = i; tmp < N; j++){
                    tmp += j;
                    if(tmp == N) count++;
                }
            }
        System.out.println(count);
        }
    }

}