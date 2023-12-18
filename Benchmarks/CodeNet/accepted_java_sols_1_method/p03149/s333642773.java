import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        boolean[] k = new boolean[4];
        for(int i = 0; i < 4; i++) {
            int n = sc.nextInt();
            if(n == 1) k[0] = true;
            if(n == 9) k[1] = true;
            if(n == 7) k[2] = true;
            if(n == 4) k[3] = true;            
        }
        boolean ans = true;
        for(int i = 0; i < 4; i++ ) {
            ans &= k[i];
        }
        System.out.println(ans?"YES":"NO");
    } 
}