import java.util.*;
import java.util.function.*;
import java.lang.*;
import java.io.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] a = new int[N+1];
        for(int n=1; n<=N; n++) a[n] = sc.nextInt();

        int ans = 0;

        for(int n=1; n<=N; n++){
            if(n%2==1 && a[n]%2==1) ans++;
        }

        System.out.println(ans);
    }
}
