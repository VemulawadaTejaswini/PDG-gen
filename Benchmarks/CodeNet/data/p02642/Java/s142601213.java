import java.util.*;
import java.lang.*;

public class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
        int ans=0;
        boolean p[]=new boolean[1000001];
        int a[]=new int[N];
        for(int i=0; i<N; i++){
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        for(int i=0; i<N; i++){
            if(!p[a[i]]){
                for(int j=2; a[i]*j<a[N-1]+1; j++){
                    p[a[i]*j]=true;
                }
            }
        }
        for(int i=0; i<N; i++){
            if(!p[a[i]]){
                ans++;
            }
        }
        System.out.println(ans);
    }
}