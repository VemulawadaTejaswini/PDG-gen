import java.util.*;

import java.util.*;

public class Main {
    
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String s; int sum;
        
        while(true){
            s=sc.next();sum=0;
            
            if(s.equals("0"))break;
            
            for(int i=0;i<s.length();i++){
                sum+=Character.getNumericValue(s.charAt(i));
            }
            
            System.out.println(sum);
        }
    }
}
