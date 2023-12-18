import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args){
        String ANS = "No";
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt(), B = sc.nextInt(), C = sc.nextInt() ;
        int K = sc.nextInt();
        for(int i = 0; i <= K;i++){
            if(A < B){
                if (B < C){
                    ANS = "Yes";
                    break;
                }
                else{
                    C = C*2;
                }
            }
            else{
                B = B*2;
            }
        }
        System.out.println(ANS);
        

    }
}