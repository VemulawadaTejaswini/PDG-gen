import java.util.*;
import java.io.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt()+1;
        int Q = sc.nextInt();
        String S = "-"+sc.next();

        int[] acCount = new int[N];
        for(int n=1; n<N; n++){
            if(S.substring(n-1,n+1).equals("AC")) acCount[n]=acCount[n-1]+1;
            else acCount[n] = acCount[n-1];
        }

        for(int q=0; q<Q; q++){
            int L = sc.nextInt()-1;
            int R = sc.nextInt();
            System.out.println(S.substring(L,L+2).equals("AC") ? acCount[R]-acCount[L]-1 : acCount[R]-acCount[L]);
        }

    }
}