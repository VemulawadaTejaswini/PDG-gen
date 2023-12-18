import java.util.*;
import java.math.*;
     
class Main{
    public static void main(String[] args) {
        
        try(Scanner sc = new Scanner(System.in)){
 
            int one = Integer.parseInt(sc.next());
            int zero = Integer.parseInt(sc.next());
            int minus = Integer.parseInt(sc.next());
            int k = Integer.parseInt(sc.next());

            int ans = 0;

            for(int i = 0; i < k; i++){
                if(one != 0){
                    one--;
                    ans++;
                }else if(zero != 0){
                    zero--;
                }else if(minus != 0){
                    minus--;
                    ans--;
                }
            }

            System.out.println(ans);
            
        }catch(Exception e){
            e.printStackTrace();
        }        
    }
}