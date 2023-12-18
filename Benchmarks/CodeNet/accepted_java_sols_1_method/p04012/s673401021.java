

import java.math.BigDecimal;
import java.util.*;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String w = sc.next();
       
        String res = "Yes";
        for (int i=0; i<w.length(); i++){
            int count = 0;
            for (int j=0; j<w.length(); j++){
                if (w.charAt(j) == w.charAt(i)){
                    count++;
                }
            }
            if (!(count%2 == 0)){
                res = "No";
                break;
            }
        }
        System.out.println(res);
    }
}