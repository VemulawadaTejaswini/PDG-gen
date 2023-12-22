import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int[] L = new int[N];
        
        int max = 0;
        int maxIndex = 0;
        for(int i = 0; i < N; i++){
            L[i] = sc.nextInt();
            
            if( max < L[i]){
                max = L[i];
                maxIndex = i;
            }
        }
        
        int sum = 0;
        for(int i = 0; i < N; i++){
            if( i != maxIndex ) sum += L[i];
        }

        System.out.println( max < sum ? "Yes" : "No" );
        
    }
}
