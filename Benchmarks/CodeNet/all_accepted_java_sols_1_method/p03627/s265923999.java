import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Santa on 2016/10/16.
 */
public class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        long[] map = new long[N];

        for (int i = 0; i < N; i++) {
            map[i] = scanner.nextLong();
        }

        Arrays.sort(map);

        long ans = -1;
        int ok = 0;
        for (int i = 1; i < N; i++) {

            if(map[N - i] == map[N - i - 1]){
                if(ans != -1){
                    ans *= map[N - i];
                    ok = 1;
                    break;
                }else{
                    ans = map[N - i];
                    i++;
                }
            }
        }
        if(ok != 0) {
            System.out.println(ans);
        }else{
            System.out.println(0);
        }

    }


}