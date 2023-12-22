import java.util.*;

public class Main{
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        int N=sc.nextInt();
        int M = sc.nextInt();
        Integer A[]=new Integer[N];
        double count=0;
        for(int i=0;i<N;i++){
            A[i]=sc.nextInt();
        
        }
        for(int i=0;i<N;i++){
            count+=A[i];
        }
        double T=0;
        T=count/(4.0*(double)M);
        Arrays.sort(A,Collections.reverseOrder());
        boolean flag = true;
        for(int i=0;i<M;i++){
            if((double)A[i]>=T){
            flag = true;
            }else if((double)A[i]<T){
            flag = false;
            break;
            }
        }
        if(flag==true)
        System.out.println("Yes");
        else if(flag==false)
        System.out.println("No");
    }
}