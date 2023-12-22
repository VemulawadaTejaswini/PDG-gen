import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        
        int max1 = 0;
        int max2 = 0;
        
        for(int i = 0; i < N; i++){
            A[i] = sc.nextInt();
            
            if ( max1 < A[i]){
                max1 = A[i];
            } else if ( max2 < A[i] ) {
                max2 = A[i];
            }
            
        }
        
        for(int i = 0; i < N; i++){
            
            if ( A[i] != max1 ){
                System.out.println(max1);
            } else {
                System.out.println(max2);
            }
            
        }
        
    }
}
