import java.util.*;

/**
 * Created by Seiya on 2016/10/16.
 */
public class Main {
    // static final long MOD = 1000000007;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N;
        String S;
        int a = 0;
        int max = 0;
        N = scanner.nextInt();
        S = scanner.next();
        for (int i = 0; i < N; i++) {
            if(S.charAt(i) == 'I'){
                a++;
            }else{
                a--;
            }

            max = Math.max(a, max);

        }

        System.out.println(max);


    }





}


