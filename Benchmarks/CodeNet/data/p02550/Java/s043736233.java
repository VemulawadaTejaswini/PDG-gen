import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String n_x_m [] = s.split(" ", -1);
        long n = Long.parseLong(n_x_m[0]);
        long x = Long.parseLong(n_x_m[1]);
        long m = Long.parseLong(n_x_m[2]);
        long A[] = new long[(int)m];
        long Loop[] = new long [(int)m];
        A[0] = x;
        Loop[(int)x] = 1;

        long y = 0, cnt1 = 0, cnt2 = 0, cnt3 = 0, ans = 0, sum = 0;

        for(int i = 1; i < (int)m; i++){
            y = A[i - 1] * A[i - 1] % m;
            if(y == 0){
                cnt1 = i;
                break;
            }
            if(Loop[(int)y] > 0){
                cnt1 = i - Loop[(int)y] + 1;
                cnt2 = Loop[(int)y] - 1;
                break;
            }
            A[i] = y;
            Loop[(int)y] = i + 1;
        }
        //System.out.println("y:" + y);
        //System.out.println("cnt1:" + cnt1);
        //System.out.println("cnt2:" + cnt2);
        if(y == 0){
            for(long i = 0; i < cnt1; i++){
                ans += A[(int)i];
            }
        }else{
            for(long i = 0; i < cnt2; i++){
                ans += A[(int)i];
            }
            for(long i = cnt2; i < cnt1 + cnt2; i++){
                sum += A[(int)i];
            }
            long a = (n - cnt2) / cnt1;
            cnt3 = (n - cnt2) % cnt1;
            ans += sum * a;
            for(long i = cnt2; i < cnt2 + cnt3; i++){
                ans += A[(int)i];
            }
        }
        System.out.println(ans);
    }
}
