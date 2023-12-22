import java.util.*;

public class Main {
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        int[] a = new int[N]; 
        
        for(int i=0; i<N; i++){
            
            a[i] = 1;
            
        }
        
        for(int i=0; i<K; i++){
            
            int d = scanner.nextInt();
            
            for(int j=0; j<d; j++){
                
                int A = scanner.nextInt();
                int X = A-1;
                
                a[X] = 0; 
                
            }
            
        }
        
        int Sum = 0;
        
        for(int i=0; i<N; i++){
            
            Sum += a[i];
            
        }
        
        System.out.println(Sum);
        
    }
}
