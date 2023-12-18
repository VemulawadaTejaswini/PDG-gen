
import java.util.*;
import java.math.*;
     
class Main{
    public static void main(String[] args) {
        
        try(Scanner sc = new Scanner(System.in)){
            double a = Long.parseLong(sc.next());
            double b = Double.parseDouble(sc.next());

            System.out.println((long)Math.floor(a*b));

        }catch(Exception e){
            e.printStackTrace();
        }        
    }
}