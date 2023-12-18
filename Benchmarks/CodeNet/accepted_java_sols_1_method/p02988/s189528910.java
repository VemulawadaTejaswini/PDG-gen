import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] p = new int[N];
        for(int n=0; n<N; n++){
            p[n]=sc.nextInt();
        }
        int ans=0;
        for(int n=1; n<N-1; n++){
            if((p[n-1]<p[n])^(p[n+1]<p[n])) ans++;
        }
        System.out.println(ans);
    }
}