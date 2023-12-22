import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int W[] = new int[N+1];
        int T = 0,S1 = 0,S2 = 0,abs = 0,min = 100;

        for(int i = 1; i <= N; i++){
            W[i] = sc.nextInt();
        }

        for (int i = 1; i <= N; i++){
            T = W[i];//Tがi番目の時
            //System.out.println("T="+T);

            for(int j = 1; j <= i; j++){
                S1 += W[j]; 
                //System.out.println("S1="+S1);
            }

            for(int k = i+1; k < N+1; k++){
                if(N == i){
                    break;
                }
                S2 += W[k];
            }

            //System.out.println("S1="+S1);
            //System.out.println("S2="+S2);

            abs = S1-S2;
            if(abs < 0){
                abs = -1*abs;
            }

            //System.out.println("abs="+abs);
            if(abs < min){
                min = abs;
            }
            //System.out.println("min="+min);

            S1=0;
            S2=0;

        }


        System.out.println(min);
        

    }
}
