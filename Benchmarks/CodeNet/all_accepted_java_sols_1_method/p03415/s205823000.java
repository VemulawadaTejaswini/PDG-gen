import java.util.*;
import java.math.*;
     
class Main{
    public static void main(String[] args) {
        
        try(Scanner sc = new Scanner(System.in)){

            String lineA = sc.next();
            String lineB = sc.next();
            String lineC = sc.next();

            System.out.println(lineA.substring(0,1) + lineB.substring(1,2) + lineC.substring(2,3));

        }catch(Exception e){
            e.printStackTrace();
        }        
    }
}