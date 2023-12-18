import java.util.Arrays;
import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[] X = new int[N];
        int[] x = new int[N];
        for(int i=0;i<N;++i)X[i]=scan.nextInt();
        for(int i=0;i<N;++i)x[i]=X[i];
        Arrays.sort(x);
        int bef = x[N/2 -1];
        int aft = x[N/2];
        for(int i=0;i<N;++i)System.out.println((X[i]<=bef ? aft:bef));
}
}