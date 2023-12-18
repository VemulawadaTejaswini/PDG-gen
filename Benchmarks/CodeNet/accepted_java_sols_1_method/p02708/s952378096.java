import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class Main {
    public static void main(String[] args){

        try{
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            String[] ss=br.readLine().split(" ");
            int n=Integer.parseInt(ss[0]);
            int k=Integer.parseInt(ss[1]);
            long w=1000000007;
            long[] pre=new long[n+1];
            for(int i=1;i<=n;i++){
                pre[i]=pre[i-1]+i;
            }
            long[] pos=new long[n+1];
            pos[n]=n;
            for(int i=n-1;i>=0;i--){
                pos[i]=pos[i+1]+i;
            }
            long ans=0;
            for(int i=k-1;i<=n;i++){
                ans+=(pos[n-i]-pre[i]+1);
                ans=ans%w;
            }
            System.out.println(ans);


        }catch(Exception e){
            System.out.println("KKKK "+e.getMessage());
        }
    }
}
