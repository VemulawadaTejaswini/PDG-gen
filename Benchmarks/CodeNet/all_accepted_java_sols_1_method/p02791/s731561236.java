import java.io.*;
import java.util.*;
import java.lang.*;


public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] P = new int[N];
        for(int n=0; n<N; n++) P[n]=sc.nextInt();

        int ans = 0;
        int min = 1000000;
        for(int n=0; n<N; n++){
            if(P[n] < min) ans++;
            min = Math.min(min, P[n]);
        }
        System.out.println(ans);
    }


}
