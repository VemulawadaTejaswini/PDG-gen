import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N;
        int[] V = new int[20];
        int[] U = new int[20];
        N=sc.nextInt();
        for(int i=0;i<N;i++){
            V[i]=sc.nextInt();
        }
        for(int i=0;i<N;i++){
            U[i]=sc.nextInt();
        }
        int sum=0;
        for(int i=0;i<N;i++){
            if(V[i]-U[i]>0) sum=sum+V[i]-U[i];
        }
        System.out.println(sum);
    }
}