import java.util.*;

public class Main {
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int num = 0;
        int sum = 0;
        
        for(int i=0; i<N; i++){
            
            num = scanner.nextInt();
            
            if(num %2 == 0){
                
                if(num %3 == 0|| num %5 == 0){
                }else{
                    sum = 1;
                    break;
                }
                
            }
            
        }
        
        if(sum==0){
            System.out.println("APPROVED");
        }else{
            System.out.println("DENIED");
        }
        
    }
}
