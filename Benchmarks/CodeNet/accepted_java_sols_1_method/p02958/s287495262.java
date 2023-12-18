import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        int[] p = new int[N];
        int[] q = new int[N];

        int c = 0;

        for(int i = 0; i<N; i++){
            p[i] = sc.nextInt();
            q[i] = p[i];
        }
        Arrays.sort(q);

        for(int i = 0; i < N; i++){
            if(p[i] != q[i]){
                c++;
            }
        }

        if(c > 2){
            System.out.println("NO");
        }else{
            System.out.println("YES");
        }

    }
}