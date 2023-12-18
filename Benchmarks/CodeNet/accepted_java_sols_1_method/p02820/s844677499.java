import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();
        int R = sc.nextInt();
        int S = sc.nextInt();
        int P = sc.nextInt();
        String T = sc.next();

        int ans = 0;
        /*T = T.replace("r","P").replace("p","S").replace("s","R");
        System.out.println(T);

        for(int i=0; i<T.length(); i++) {

            if(T.charAt(i) == 'R'){
                if(i >= K && T.charAt(i - K) == 'R') 
                    continue;
                ans += R;
            } 
            else if(T.charAt(i) == 'S') {
                if(i >= K && T.charAt(i - K) == 'S') 
                    continue;
                ans += S;
            } 
            else if(T.charAt(i) == 'P') {
                if(i >= K && T.charAt(i - K) == 'P') 
                    continue;
                ans += P;
            }
        }
        */

        boolean[] win = new boolean[N];
        for(int i = 0; i<N; i++) {
            //最初に例外処理をすることでTの範囲外のExceptionを防ぐ
            //win[i - k]は連続で手がカウントできなくなることを防ぐ
            if(i >= K && win[i - K] && T.charAt(i) == T.charAt(i - K))
                continue;
            else {
                win[i] = true;
            }
            switch (T.charAt(i)) {
            case 'r':
                ans += P;
                break;
            case 's':
                ans += R;
                break;
            case 'p':
                ans += S;
                break;
            }
            
        }

        System.out.println(ans);
    }
}