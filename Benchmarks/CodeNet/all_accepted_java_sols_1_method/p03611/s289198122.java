import java.util.*;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Set;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int[]a=new int[3*N];
        for(int i=0;i<N;i++){
            a[i]=sc.nextInt();
            a[N+i]=a[i]+1;
            a[2*N+i]=a[i]-1;
        }
        int max=0;
        int aa=1;
        Arrays.sort(a);
        for(int i=0;i<3*N-1;i++){
            if(a[i]==a[i+1]){
                aa++;
            }else{
                if(aa>=max){
                    max=aa;
                    aa=1;
                }else{
                    aa=1;
                }
            }
        }
        System.out.println(max);
        

        
}
        
        
    }
