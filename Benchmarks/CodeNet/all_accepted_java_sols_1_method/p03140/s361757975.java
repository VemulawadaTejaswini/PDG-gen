import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {

        try {
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            int N = Integer.parseInt(in.readLine());
            char[] A = String.valueOf(in.readLine()).toCharArray();;
            char[] B = String.valueOf(in.readLine()).toCharArray();;
            char[] C = String.valueOf(in.readLine()).toCharArray();;
            
            int changeCnt = 0;
            int sameCnt;
            for (int i = 0; i < N; i++) {
                sameCnt = 0;
                if (A[i] == B[i]) {
                    sameCnt++;
                }
                if (A[i] == C[i]) {
                    sameCnt++;
                }
                if (B[i] == C[i]) {
                    sameCnt++;
                }
                
                if (sameCnt < 2) {
                   changeCnt += (2 - sameCnt); 
                }
            }
             
            System.out.println(changeCnt);
        } catch(Exception e) {
            System.out.println(e);
            System.exit(0);
        }
    }
}
