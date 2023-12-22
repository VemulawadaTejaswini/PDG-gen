import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int L = sc.nextInt();
        int min = Math.abs(L);
        int x = 0;
        int ans = 0;

        for(int i=1; i<=N; i++){
            int abs = Math.abs(L + i - 1);
            if(min>=abs){
                min = abs;
                x = i;
            }
        }
        for(int i=1; i<=N; i++){
            if(i==x){
                continue;
            }
            ans += L + i - 1;
        }
        System.out.println(ans);
    }
}