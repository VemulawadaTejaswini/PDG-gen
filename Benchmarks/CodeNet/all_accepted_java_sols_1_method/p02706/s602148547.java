import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        
        for(int i=0; i<M; i++){
            
            int A = scanner.nextInt();
            N -= A;
            }
        
        if(N>=0){
            System.out.println(N);
        }else{
            System.out.println(-1);
        }
        
    }
}
