import java.util.*;
//import java.lang.Math;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while(true){
            int N=sc.nextInt();
            if(N==0) break;
            int A[]=new int[N];
            for(int i=0;i<N;i++) A[i]=sc.nextInt();
            Arrays.sort(A);
            int sum=0;
            for(int i=1;i<N-1;i++) sum+=A[i];
            int rem=sum%(N-2);
            sum-=rem;
            System.out.println(sum/(N-2));
        }
    }
}
