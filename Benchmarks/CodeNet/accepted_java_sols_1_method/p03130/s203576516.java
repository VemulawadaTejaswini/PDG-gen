import java.util.*;
import java.lang.*;

public class Main{
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int[] a = new int[3];
        int[] b = new int[3];

        boolean ans = false;
        
        for (int i = 0; i < 3; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
        }
        
        int[] count = new int[4];
        Arrays.fill(count, 0);
        for (int j = 0; j < 3; j++) {
            count[a[j] - 1]++;
            count[b[j] - 1]++;
        }
        
        int one = 0;
        for (int i = 0; i <= 3; i++) {
            if (count[i] == 1) {
                one++;
            }
        }
        
        if (one <= 2) {
            ans = true;
        }
        System.out.println(ans?"YES":"NO");
    }

}