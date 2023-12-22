import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int A[];
        A=new int[N-1];
        for(int i=0;i<N-1;i++){
            A[i]=sc.nextInt();
            A[i]--;
        }
        int ans[];
        ans=new int[N];
        for(int i=0;i<N-1;i++) ans[A[i]]++;
        for(int i=0;i<N;i++) System.out.println(ans[i]);
        sc.close();
    }
}