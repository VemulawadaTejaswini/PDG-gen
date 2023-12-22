import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);
        
        int x = scanner.nextInt();
        int i = 0;
        int X;
        int hantei = 0;
        int ans = 0;
        
        while(hantei == 0){
            
            X = x+i;
            
            for(int j=2; j<=X; j++){
                
                if(X%j==0){
                    if(j==X){
                        hantei = 1;
                        ans = X;
                    }else{
                        break;
                    }
                }
                
            }
            
            i++;
            
        }
        
        
        System.out.println(ans);
        
        
    }
}
