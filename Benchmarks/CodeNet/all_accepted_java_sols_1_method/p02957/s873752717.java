import java.util.*;
import java.util.Arrays;
public class Main{
    
    
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        int k = 0;
        if((a+b)%2==0){
            k = (int)((a+b)/2);
            System.out.println(k);

        }
        else{
            System.out.println("IMPOSSIBLE");
        }
        
    }
   
    
       
    
}