import java.util.*;
//import java.lang.Math;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while(true){
            int N=sc.nextInt();
            int R=sc.nextInt();
            if(N+R==0) break;
            int A[]=new int[N];
            for(int i=0;i<N;i++) A[i]=N-i;
            for(int i=0;i<R;i++){
                int p=sc.nextInt();
                int c=sc.nextInt();
                int B[]=new int[N];
                int now=0;
                for(int j=p-1;j<p-1+c;j++){
                    B[now]=A[j];
                    now++;
                }
                for(int j=0;j<p-1;j++){
                    B[now]=A[j];
                    now++;
                }
                for(int j=p-1+c;j<N;j++){
                    B[now]=A[j];
                    now++;
                }
                for(int j=0;j<N;j++) A[j]=B[j];
            }
            System.out.println(A[0]);
        }
    }
}
