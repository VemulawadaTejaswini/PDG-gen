import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        long[] select=new long[N+1];

        int[] list=new int[N];
        
        long[] count=new long[N+1];
        
        for(int i=0;i<N;i++){
            int tmp=sc.nextInt();
            list[i]=tmp;
            count[tmp]++;
        }
        
        long ans=0L;
        
        for(int i=0;i<N+1;i++){
            ans+=(count[i]*(count[i]-1))/2;
        }
        
        for(int i=0;i<N;i++){
            long next=ans-(long)count[list[i]]+1;
            System.out.println(next);
        }
    }
}