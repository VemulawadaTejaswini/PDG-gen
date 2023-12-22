import java.util.Scanner;

import static java.util.Arrays.sort;

public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int[] A=new int[N];
        for(int i=0; i<N; i++){
            A[i]=sc.nextInt();
        }
        sort(A);
        int mannakado = Integer.MAX_VALUE/2;
        for(int i=0; i<N; i++){
            int tm=Math.abs(A[N-1]/2 - A[i]);
            if( tm <= mannakado){
                mannakado=tm;
            }else{
                System.out.println(A[N-1]+" "+A[i-1]);
                System.exit(0);
            }
        }
        System.out.println(A[N-1]+" "+A[N-2]);
    }
}
