import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int M=sc.nextInt();
        int[] A=new int[N];
        int[] ASUM=new int[N+1];
        ASUM[0]=0;
        
        for(int i=0;i<N;i++){
            A[i]=sc.nextInt();
            A[i]=A[i]%M;
        }
        
        int sum=0;
        
        for(int i=0;i<N;i++){
            sum=(sum+A[i])%M;
            ASUM[i+1]=sum;
        }
        
        Arrays.sort(ASUM);
        long ANS=0L;
        int idx=0;
        
        long same=1L;
        
        for(int i=idx;i<N;i++){
            if(ASUM[i]==ASUM[i+1]){
                same++;
            }else{
                ANS+=(same*(same-1))/2;
                same=1L;
            }
        }
        
        ANS+=(same*(same-1))/2;
        
        System.out.println(ANS);
        
    }
}