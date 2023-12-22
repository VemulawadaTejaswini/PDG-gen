import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] P = new int[N];        
        int ans = 0;

        for(int i=0; i<N; i++){
            P[i] = sc.nextInt();
        }
        int max = P[0];
        int min = P[0];
        for(int i=0; i<N; i++){
            if(max>=P[i] && min>=P[i]){
                ans += 1;
            }
            max = Math.max(max, P[i]);
            min = Math.min(min, P[i]);
        }
        System.out.println(ans);
    }
}