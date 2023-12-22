import java.util.*;

public class Main {
    
    
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int Q = sc.nextInt();
        String S = sc.next();
        
        char[] buf = S.toCharArray();
        
        int[] acCnt = new int[S.length()];
        acCnt[0] = 0;
        int sumCnt = 0;

        for (int i = 1; i < S.length(); ++i) {
        
            if ( (buf[i - 1] == 'A')  && (buf[i] == 'C') ) {
                ++sumCnt;
            }
            acCnt[i] = sumCnt;
        }
        
        for (int i = 0; i < Q; ++i) {
            int l = sc.nextInt() - 1;
            int r = sc.nextInt() - 1;
            int cnt = acCnt[r] - acCnt[l];
            System.out.println(cnt);
        }
        
    }
}
