import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int K = sc.nextInt();
        
        int A[] = new int[N];
        int B[] = new int[M];
        
        int count = 0;
        int time = 0;
        int a = 0;
        int b = 0;
        
        for(int i=0;i<N;i++){
            A[i] = sc.nextInt();
        }
        
        for(int i=0;i<M;i++){
            B[i] = sc.nextInt();
        }
        
        while(time<=K){
            if(A[a]<B[b]){
                time += A[a];
                a++;
                count++;
            } else {
                time += B[b];
                b++;
                count++;
            }
        }
        
        if(time>K){
            count--;
        }
        
        System.out.println(count);
    }
}
