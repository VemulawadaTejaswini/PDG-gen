import java.util.*;

/**
 * Created by Santa on 2016/10/16.
 */
public class Main {

    static int N;
    static long A;
    static long B;
    static long C;
    static long[] map;





    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();

        map = new long[N];

        for (int i = 0; i < N; i++) {
            map[i] = scanner.nextLong();
        }

        long temp = 0;
        long  old = temp;

        long ans = 0;
        int left = 0;
        for (int i = 0; i < N; i++) {

            if((map[i] ^ temp) == map[i] + temp){
                temp = map[i] ^ temp;
                ans += i - left + 1;
            }else {
                int cnt = 0;
                while (true) {
                    temp = map[left] ^ temp;
                    left++;
                    if ((temp ^ map[i]) == temp + map[i]) {
                        ans += i - left + 1;
                        temp = map[i] ^ temp;
                        break;
                    }
                }



            }

        }

        System.out.println(ans);

    }



}

