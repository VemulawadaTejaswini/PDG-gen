import java.util.*;
import java.lang.*;

public class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
        int K=sc.nextInt();
        int a[]=new int[N];
        for(int i=0; i<N; i++){
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        
        int l=0;
        int r=a[N-1];
        int mid;
        int J=0;
        while(r-l>1){
            J=0;
            mid=(r+l)/2;
            for(int i=0; i<N; i++){
                if(a[i]>mid){
               J+=(int)Math.ceil((double)a[i]/mid)-1;
                }
            }
            if(J>K){
                l=mid;
            }else{
                r=mid;
            }
        }
        System.out.println(r);
    }
}