import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long[] ary = new long[N];
        int ans = 0;
        for(int i = 0; i < N; i++){
            ary[i] = sc.nextLong();
        }
        long[] cnt_ary = new long[N+1];
        for(int i = 0; i < N; i++){
            if(N < ary[i]){
                ans++;
            }else{
                cnt_ary[(int)ary[i]]++;
            }
        }
        for(int i = 0; i < N+1; i++){
            if(cnt_ary[i] > i){
                ans += cnt_ary[i] - i;
            }else if(cnt_ary[i] < i){
                ans += cnt_ary[i];
            }
        }
		System.out.println(ans);
    }
}