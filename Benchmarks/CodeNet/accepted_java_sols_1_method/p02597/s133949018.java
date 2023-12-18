import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args){
        // input N
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int ANS = 0;
        String S = sc.next();
        for (int i =0;i < N; i ++){
            if ('W' == S.charAt(i)){
                ANS += 1;
            }
        }
      	int kiri = N - ANS;
        String SS = S.substring(kiri);
        long len = SS.length();
        for(int j = 0; j < len;j++){
            if ('W' == SS.charAt(j)){
                ANS -= 1;
            }
        }
        System.out.println(ANS);
        
    }
}