import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();   //奇数
        int[] dam = new int[N];
        int[] ans = new int[N];
        
        int sumRain = 0;
        for(int i = 0; i < N; i++){
            dam[i] = sc.nextInt();
            ans[i] = 0;
            sumRain += dam[i];
        }

        int sum = 0; 
        for(int i = 1; i < N; i += 2){
            sum += dam[i] * 2;
        }

        ans[0] = sumRain - sum;
        for(int i = 0; i < N-1; i++){
            ans[i+1] = dam[i]*2 - ans[i];
        }

        for(int i = 0; i < N; i++){
            System.out.print(ans[i] + " ");
        }
    }
}
