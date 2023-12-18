import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner scan = new Scanner(System.in);
        
        int number = scan.nextInt();
        int bstart = scan.nextInt();
        int ball = 0;
        
        int count;
        int ans = 0;
        for(count = 0 ; count < number ; count++){
            
            ball = scan.nextInt();
            
            if(ball < bstart - ball){
                ans += ball * 2;
            }else{
                ans += (bstart - ball) * 2;
            }
        }
 
        System.out.println(ans);
        
    }
}