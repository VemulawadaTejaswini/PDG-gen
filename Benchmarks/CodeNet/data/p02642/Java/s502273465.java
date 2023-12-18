import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.next()); 
        int[] A = new int[N]; 
        int count = 0;
        int han = 0;
        
        for(int i=0; i<N; i++){
            A[i] = scanner.nextInt();
        }
        
        for(int i=0; i<N; i++){
            
            for(int j=0; j<N; j++){
                
                han = 1;
                
                if(j==i){
                    continue;
                }
                
                if(A[i]%A[j]==0){
                    han = 0;
                    break;
                }
                
                
            }
            
            count += han;
            
        }
        
        System.out.println(count);
        
    }
}
