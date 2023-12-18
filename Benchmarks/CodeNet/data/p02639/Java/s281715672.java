import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);
        
        int count = 0;
        
        for(int i=0; i<5; i++){
            
            int N = scanner.nextInt();
            
            if(N!=i+1){
                count = i+1;
                break;
            }
            
        }
        System.out.println(count);
        
    }
}
