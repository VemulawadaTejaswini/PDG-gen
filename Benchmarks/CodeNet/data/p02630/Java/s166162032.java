import java.util.*;
import java.lang.*;

public class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
        int num[]=new int[100000];
        long S=0;
        int index=0;
        for(int i=0; i<N; i++){
            index=sc.nextInt()-1;
            num[index]++;
            S+=(index+1);
        }
        int Q=sc.nextInt();
        int B[]= new int[Q];
        int C[]= new int[Q];
        long s[]= new long[Q+1];
        s[0]=S;
        for(int i=0; i<Q; i++){
            B[i]= sc.nextInt();
            C[i]= sc.nextInt();
            if(num[B[i]-1]>0){
                s[i+1]= (long)(s[i]-num[B[i]-1]*B[i]+num[B[i]-1]*C[i]);
                num[C[i]-1]+=num[B[i]-1];
                num[B[i]-1]=0;
            }else{
                s[i+1]=s[i];
            }
        }
        for(int i=1; i<Q+1; i++){
            System.out.println(s[i]);
        }
    }
}
