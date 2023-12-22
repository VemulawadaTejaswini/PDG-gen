import java.util.*;
import java.lang.*;

public class Main{
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][][] info = new int[4][3][10];
        
        for (int i = 0; i < n; i++) {
            int b = sc.nextInt() - 1;
            int f = sc.nextInt() - 1;
            int r = sc.nextInt() - 1;
            int v = sc.nextInt();
            info[b][f][r] += v;
        }
        
        for (int b = 0; b < 4; b++) {
            for (int f = 0; f < 3; f++) {
                for (int r = 0; r < 10; r++) {
                    System.out.print(" " + info[b][f][r]);
                }
                System.out.println();
            }
            if (b != 3) {
                System.out.println("####################");
            }
        }
    }
}
