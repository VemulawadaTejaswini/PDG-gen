import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int[] n=new int[31];
        int j=0;
        while(true){
            n[j]=scan.nextInt();
            if(n[j]==0) break;
            j++;
        }
        j=0;
        while(true){
            if(n[j]==0) break;
            int[] dp=new int[n[j]+1];
            dp[0]=1;
            for(int i=0;i<n[j];i++){
                if(i==0) dp[i+1]=dp[i];
                else if(i==1) dp[i+1]=dp[i]+dp[i-1];
                else dp[i+1]=dp[i]+dp[i-1]+dp[i-2];
            }
            int ans=0;
            //sSystem.out.println(":"+dp[n]+":"+n);
            if(dp[n[j]]<=3650) System.out.println(1);
            else if((dp[n[j]]%3650)==0) System.out.println(dp[n[j]]/3650);
            else System.out.println((dp[n[j]]/3650)+1);
            j++;
        }
    }
}
