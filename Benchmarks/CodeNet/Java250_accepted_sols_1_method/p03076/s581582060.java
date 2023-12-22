import java.util.*;
import java.lang.*;

public class Main{
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int[] p = new int[5];
        
        for (int i = 0; i < 5; i++) {
            p[i] = sc.nextInt();
        }
        
        int ans = 0;
        int min = Integer.MAX_VALUE;
        int minrest = Integer.MAX_VALUE;
        
        
        
        for (int i = 0; i < 5; i++) {
            int rest = p[i] % 10;
            if (rest < minrest && rest != 0) {
                minrest = rest;
                min = i;
            }
        }
        
        for (int i = 0; i < 5; i++) {
            if (i != min && p[i] % 10 != 0) {
                p[i] += 10 - p[i] % 10;
            }
            ans += p[i];
        }
        
        System.out.println(ans);

    }
}
