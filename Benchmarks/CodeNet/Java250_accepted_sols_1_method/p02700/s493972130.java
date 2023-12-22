import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        
        int T_health = in.nextInt();
        int T_streng = in.nextInt();
        int A_health = in.nextInt();
        int A_streng = in.nextInt();
     
        int k = 0;
        while(A_health > 0 && T_health > 0) {
            
            if(1-k == 1) {
                k = 1;
                A_health =  A_health - T_streng;
            }
            else {
                k = 0;
                T_health = T_health - A_streng;
            }
            
            if(T_health <= 0) {
                System.out.println("No");
            }
            else if(A_health <= 0) {
                System.out.println("Yes");
            }
        }
    }
    

        
}
