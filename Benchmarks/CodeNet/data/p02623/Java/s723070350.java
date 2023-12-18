import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        long K = sc.nextLong();
        long[] a = new long[N];
        long[] b = new long[M];
        int I = 0;
        int J = 0;
        int ans = 0;
        boolean testa = true;
        boolean testb = true;
        
        for(int i=0; i<N; i++){
            a[i] = sc.nextInt();
            //System.out.println(a[i]);
        }
        for(int i=0; i<M; i++){
            b[i] = sc.nextInt();
            //System.out.println(b[i]);
        }
        
        while(K > 0){
            //System.out.println(a[I]+":"+b[J]);
            if(a[I] <= b[J] && testa){
                K -= a[I];
                //System.out.print("I"+":"+I+">");
                if(I < N-1){
                    I++;
                }else if(I == N-1){
                    testa = false;
                    a[I] = (long)10e9+1;
                }
            }else if(a[I] >= b[J] && testb){
                K -= b[J];
                //System.out.print("J"+":"+J+">");
                if(J < M-1){
                    J++;
                }else if(J == M-1){
                    testb = false;
                    b[J] = (long)10e9+1;
                }
            }else if(!testa && !testb){
                break;
            }
            ans++;
            if(K < 0){
                ans--;
            }
            //System.out.println("K"+":"+K+","+ans);
        }
        
        System.out.println(ans);
    }
}