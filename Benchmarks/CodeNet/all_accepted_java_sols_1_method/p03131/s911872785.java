import java.util.*;
import java.lang.*;

public class Main{
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        long k = sc.nextLong();
        long a = sc.nextLong();
        long b = sc.nextLong();
        long biscuit = 1;
        long rest = k;
        long max = 0;
        long ans = 0;
        int money = 0;
        
        
        rest = k - (a - 1);
        biscuit = a;
        
        if (b - a <= 1) {
            max = k + 1;
        } else {
            while (rest > 0) {
                if (rest == 1) {
                    if (money == 0) {
                        biscuit++;
                    } else {
                        biscuit += b;
                    }
                    break;
                }
                if (biscuit >= a && money == 0) {
                    biscuit -= a;
                    money ++;
                } else {
                    biscuit += b;
                    money --;
                }
                rest --;
                //System.out.println(biscuit);
            }
            max = biscuit;
        }
        
        ans = max;
        //System.out.println("---");
        System.out.println(ans);
    }

}