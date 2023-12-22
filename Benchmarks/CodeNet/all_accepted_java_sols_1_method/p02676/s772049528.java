import java.util.*;
import java.math.*;
     
class Main{
    public static void main(String[] args) {
        
        try(Scanner sc = new Scanner(System.in)){
 
            int k = Integer.parseInt(sc.next());
            String s = sc.next();

            String ans = "";

            if(s.length() <= k){
                ans = s;
            }else{
                ans = s.substring(0, k) + "...";
            }

            System.out.println(ans);

        }catch(Exception e){
            e.printStackTrace();
        }        
    }
}