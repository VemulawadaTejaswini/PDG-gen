import java.util.*;

class Main{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int X = sc.nextInt();
        int[] L = new int[N];
        int[] D = new int[N + 1];
        D[0] = 0;

        for(int i=0; i<N; i++){
            L[i] = sc.nextInt();
        }

        int ans = 1;
        for(int i=1; i<=N; i++){
            D[i] = D[i - 1] + L[i - 1];
            if(D[i]<=X){
                ans += 1;
            }
        }
        System.out.println(ans);
    }
}