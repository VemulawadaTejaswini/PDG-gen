import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        boolean isZero = false;
        long A[] = new long[N];
        for(int i=0;i<N;i++)
        {
            A[i] = sc.nextInt();
            if(A[i]==0){
                isZero = true;
                break;
            }
        }
        long ans = 1;
        if(!isZero){
            for(int j=0;j<N;j++){
                if(ans * A[j] >Math.pow(10,18)){
                     ans = -1;
                     break;
                }
                else ans *= A[j];
            }
        }
        System.out.println(ans);
    }
}
