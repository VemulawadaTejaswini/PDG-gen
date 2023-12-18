import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] a = new int[N];
        boolean[] ret = new boolean[N-K+1];
        for(int i=0;i<N;i++) a[i] = sc.nextInt();
        sc.close();
        
        for(int i=0;i<N-K+1;i++){
            if(a[i]<=a[i+K]) ret[i] = false;
            else ret[i] = true;
        }

        for(int i=0;i<N-K+1;i++){
            if(!ret[i]) System.out.println("No");
            else System.out.println("Yes");
        }        
    }
}