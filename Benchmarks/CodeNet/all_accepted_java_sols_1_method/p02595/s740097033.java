import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args){
        // input N
        Scanner sc = new Scanner(System.in);
        long N = sc.nextInt(), D = sc.nextInt() ;
        int ANS = 0;
        for (int i = 0;i<N;i++){
            long x = sc.nextInt(),y = sc.nextInt();
            if (D*D >= x*x + y*y){
                ANS += 1;
            }
        }

        System.out.println(ANS);
        
    }
}