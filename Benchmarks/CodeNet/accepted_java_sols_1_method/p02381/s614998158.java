import java.util.*;
//import java.lang.Math;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while(true){
            int N=sc.nextInt();
            if(N==0) break;
            double ave=0;
            double ans=0;
            double A[]=new double[N];
            for(int i=0;i<N;i++) A[i]=sc.nextInt();
            for(int i=0;i<N;i++) ave+=A[i]/N;
            for(int i=0;i<N;i++) ans+=(A[i]-ave)*(A[i]-ave)/N;
            System.out.println(Math.sqrt(ans));
        }
    }
}
