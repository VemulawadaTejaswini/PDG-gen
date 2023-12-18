import java.util.*;
//import java.lang.Math;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int A[];
        A=new int[N];
        for(int i=0;i<N;i++) A[i]=sc.nextInt();
        boolean swp=true;
        int cnt=0;
        while(swp){
            swp=false;
            for(int i=N-1;i>=1;i--) if(A[i]<A[i-1]){
                swp=true;
                cnt++;
                int tmp=A[i];
                A[i]=A[i-1];
                A[i-1]=tmp;
            } 
        }
        for(int i=0;i<N;i++){
            System.out.print(A[i]);
            System.out.print(i==N-1?"\n":" ");
        }
        System.out.println(cnt);
        sc.close();
    }
}
