import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for(int i=0;i<N;i++) A[i] = sc.nextInt();
        int[] rec= new int[N];
        for(int i=0;i<N;i++) rec[A[i]]++;
        boolean flag;
        if(N%2==1){
            flag = (rec[0]==1);
            for(int i=1;i<=N-1;i++){
                if(i%2==1) flag = flag&(rec[i]==0);
                else flag=flag&(rec[i]==2);
            }
        }else{
            flag = (rec[0]==0);
            for(int i=1;i<=N-1;i++){
                if(i%2==1) flag = flag&(rec[i]==2);
                else flag=flag&(rec[i]==0);
            }
        }
        if(!flag){
            System.out.println(0);
        }
        else{
            long ans = 1;
            long Mod = 1000000000+7;
            for(long i=1;i<=N/2;i++) ans = (ans*2)%Mod;
            System.out.println(ans);
        }
    }
}
