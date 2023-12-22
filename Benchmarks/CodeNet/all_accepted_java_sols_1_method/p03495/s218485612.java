import java.util.*;
 
public class Main{
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int K = sc.nextInt();

        int[] A = new int[N];
        int[] C = new int[200000];
        int count = 0;
        for(int i = 0; i < N; i++){
            A[i] = sc.nextInt();
            if(C[A[i]-1] == 0)
                count++;
            C[A[i]-1]++;
        }
        sc.close();

        Arrays.sort(C);
        int ans = 0;
        if(count <= K){
            System.out.println(ans);
        } else {
            for(int i = 200000-count; i < 200000-K; i++){
                ans += C[i];
            }
            System.out.println(ans);
        }
    }
}