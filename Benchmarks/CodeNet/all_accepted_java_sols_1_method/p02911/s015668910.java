import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int K = sc.nextInt();
        int Q = sc.nextInt();
        int[] A = new int[Q];
        int[] cnt = new int[N];
        for(int i = 0; i < Q; i++){
            A[i] = sc.nextInt();
            cnt[A[i]-1]++;
        }
        sc.close();

        for(int i = 0; i < N; i++){
            if(K-(Q-cnt[i]) > 0)
                System.out.println("Yes");
            else
                System.out.println("No");
        }


    }
}