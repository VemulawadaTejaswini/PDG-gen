import java.util.*;
import java.math.*;
         
class Main{
    public static void main(String[] args) {
        
        try(Scanner sc = new Scanner(System.in)){
 
            int money = Integer.parseInt(sc.next());
            
            int grad = 0;

            int moneyPer500Success = money - money % 500;

            grad += ((moneyPer500Success)/500)*1000;
            grad += (((money % 500)-((money % 500) % 5))/5)*5;

            System.out.println(grad);

        }catch(Exception e){
            e.printStackTrace();
        }        
    }
}