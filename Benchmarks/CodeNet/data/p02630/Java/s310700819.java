import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A[] = new int[N];
        for(int i=0;i<N;i++){
            A[i] = sc.nextInt();
        }
        
        int Q = sc.nextInt();
        long sum;
        int B,C;
        
        for(int a=0;a<Q;a++){
            sum = 0;
            B = sc.nextInt();
            C = sc.nextInt();
            for(int i=0;i<N;i++){
                if(A[i] == B){
                    A[i] = C;
                }
                sum += A[i];
            }
            System.out.println(sum);
        }
    }
}
