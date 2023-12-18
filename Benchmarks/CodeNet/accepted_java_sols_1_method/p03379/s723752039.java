import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int[] X=new int[N];
        int[] R=new int[N];
        for(int i=0;i<N;i++){
            X[i]=sc.nextInt();
            R[i]=X[i];
        }
        Arrays.sort(X);
        int l=X[(N-1)/2];
        int r=X[(N-1)/2+1];
        for(int i=0;i<N;i++){
            if(R[i]<r){
               System.out.println(r);
            }else{
               System.out.println(l);
            }
        }
    }
}

