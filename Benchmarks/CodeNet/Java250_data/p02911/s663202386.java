import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int Q = sc.nextInt();
        
        
        int[] point = new int[N];
        int[] answer = new int[Q];
    
        for(int i=0;i<Q;++i){
            answer[i] =sc.nextInt();
            point[answer[i] -1]++;
            
        }
        for(int j=0;j<N;j++){
            if(K-Q+point[j]>=1){
                System.out.println("Yes");
            }
            else if(K-Q+point[j]<=0){
                System.out.println("No");
            }
        }
        
        
    }
}