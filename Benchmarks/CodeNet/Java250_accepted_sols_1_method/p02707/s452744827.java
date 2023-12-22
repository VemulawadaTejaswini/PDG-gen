import java.util.*;
public class Main{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int N,ai;
        N=sc.nextInt();
        int[] A=new int[N+1];
        for(int i=1;i<N;i++){
            ai=sc.nextInt();
            A[ai]++;
        }
        for(int j=1;j<N+1;j++)
            System.out.println(A[j]);
    }
}
