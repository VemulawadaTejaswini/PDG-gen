import java.util.*;
import java.io.*;

class Main{

    public static void main(String[] args){
        
    
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        
        int[] old = {0,0,0};
        int[] curr = {0,0,0};

        for(int i = 0; i < N; i++){
            old[0] = curr[0];
            old[1] = curr[1];
            old[2] = curr[2];

            curr[0] = Math.max( old[1], old[2] ) + sc.nextInt();
            curr[1] = Math.max( old[0], old[2] ) + sc.nextInt();
            curr[2] = Math.max( old[1], old[0] ) + sc.nextInt();
        }
    
        System.out.println( Math.max( curr[0], Math.max(curr[1], curr[2]) ) );

        sc.close();
    }
}
