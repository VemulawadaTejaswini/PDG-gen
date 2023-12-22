import java.util.*;
import java.math.*;

public class Main {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        double res = 0;
        
        sc.nextLine();
        
        for(int i = 0; i < n; i++){
            String s = sc.nextLine();
            
            String[] split = s.split(" ");
            
            if(split[1].equals("JPY")){
                res+=Double.parseDouble(split[0]);
            }else{
                res+=Double.parseDouble(split[0]) * 380000;
            }
        }
        
        System.out.println(new BigDecimal(res).toPlainString());
    }
}
