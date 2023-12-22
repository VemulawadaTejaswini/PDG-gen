import java.util.*;
import java.math.*;
     
class Main{
    public static void main(String[] args) {
        
        try(Scanner sc = new Scanner(System.in)){

            String str = sc.next();

            String ans = "";
            if(str.equals("ABC")) ans = "ARC";
            else ans = "ABC";
            
            System.out.println(ans);

        }catch(Exception e){
            e.printStackTrace();
        }        
    }
}