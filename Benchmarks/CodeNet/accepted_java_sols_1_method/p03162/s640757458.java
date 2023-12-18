import java.util.*;

class Main{
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] dp = new int[3];
        for(int day=0;day<n;day++){
            int[] newdp = new int[3];
            int[] c = new int[3];
            for(int i=0;i<3;i++){
                c[i] = scan.nextInt();
            }

            for(int i=0;i<3;i++){
                for(int j=0;j<3;j++){
                    if(i!=j){
                        newdp[j] = Math.max(newdp[j],dp[i] + c[j]);
                    }
                }
            }
            dp[0] = newdp[0];
            dp[1] = newdp[1];
            dp[2] = newdp[2];
        }
        System.out.println(Math.max(dp[0],Math.max(dp[1],dp[2])));
        scan.close();
        
}
}
