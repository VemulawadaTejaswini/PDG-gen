

import java.math.BigDecimal;
import java.util.*;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        
        boolean isSame = false;
        for (int i=0; i<a.length-1; i++){
            if (!(a[i] == a[i+1])){
                break;
            }
            if (i == a.length-2){
                isSame = true;
            }
        }
        
        int c = 0;
        if (!(isSame)){
            Arrays.sort(a);
            int minC = 999999999;
            for (int i=a[0]; i<=a[n-1]; i++){
                int temp = 0;
               for (int j=0; j<n; j++){
                   if (!(i==a[j])){
                       temp += Math.pow(a[j]-i,2);
                   }
               }
               if (temp < minC){
                   minC = temp;
               }
            }
            c = minC;
        }
        System.out.println(c);
    }
}