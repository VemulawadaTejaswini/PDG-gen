import java.util.*;
import java.math.*;
     
class Main{
    public static void main(String[] args) {
        
        try(Scanner sc = new Scanner(System.in)){

            String str = sc.next();

            str.replace("?", "D");

            System.out.println(str);

        }catch(Exception e){
            e.printStackTrace();
        }        
    }
}