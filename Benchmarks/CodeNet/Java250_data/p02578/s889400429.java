import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long A[] =new long[N];
        long count=0;
        
        for(int i=0;i<N;i++){
            A[i]=sc.nextLong();
        }
        
        for(int i=0;i<N-1;i++){
            if(A[i]>A[i+1]){
                count+=A[i]-A[i+1];
                A[i+1]+=A[i]-A[i+1];
            }
        }
        
        System.out.println(count);
    }
}
