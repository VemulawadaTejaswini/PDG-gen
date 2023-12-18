import java.util.*;

public class Main {
    
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        String S = scanner.next();
        int N = S.length();
        int[] ten = new int[N+1];
        ten[0] = 1;
        for (int i = 1; i < ten.length; i++) {
            ten[i] = (ten[i-1] * 10) % 2019;
        }
        int[] sumup = new int[N+1];
        sumup[0] = 0;
        for (int i = 1; i <= N; i++) {
            sumup[i] = (sumup[i-1] + Integer.parseInt(S.substring(N-i,N-i+1)) * ten[i-1]) % 2019; 
        }
        // for (int i = 0; i < sumup.length; i++) {
        //     System.out.println(sumup[i]);
        // }
        int[] count = new int[2019];
        for (int i = 0; i <= N; i++) {
            int res = sumup[i] % 2019;
            count[res] ++;
        }
        // System.out.println(count[0]);
        int ans = 0;
        for (int i = 0; i < count.length; i++) {
            ans += count[i]*(count[i]-1)/2;
        }
        System.out.println(ans);
    }

}