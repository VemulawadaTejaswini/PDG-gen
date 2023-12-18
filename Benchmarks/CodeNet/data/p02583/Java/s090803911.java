import java.util.*;
import java.util.function.*;
import java.lang.*;
import java.math.*;
import java.io.*;


public class Main {
    static boolean properTriangle(long... e){
        if(e.length != 3) return false;
        Arrays.sort(e);
        if(e[0] == e[1]) return false;
        if(e[1] == e[2]) return false;
        return e[0]+e[1] > e[2];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long[] L = new long[N];

        for(int n=0; n<N; n++) L[n] = sc.nextLong();
        Arrays.sort(L);

        long ans = 0;

        for(int i=0; i<N; i++) for(int j=i+1; j<N; j++) for(int k=j+1; k<N; k++){
            if(properTriangle(L[i], L[j], L[k])) ans++;
        }

        System.out.println(ans);

    }
}
