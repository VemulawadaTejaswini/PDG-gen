import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();

        int sn = s.length();
        int tn = t.length();
        int[][] dp=new int[sn+1][tn+1];
        int[][] res=new int[sn+1][tn+1];


        for (int i = 0; i <= sn; i++) {
            for (int j = 0; j <= tn; j++) {
                if(i+1<=sn){// 0: go down
                    if(dp[i+1][j] <dp[i][j]){
                        dp[i+1][j]=dp[i][j];
                        res[i+1][j]=0;
                    }
                }
                if(j+1<=tn){// 1: go right
                    if(dp[i][j+1] <dp[i][j]){
                        dp[i][j+1]=dp[i][j];
                        res[i][j+1]=1;
                    }
                }
                if(i+1<=sn && j+1<=tn && s.charAt(i)==t.charAt(j)){//down + right
                    dp[i+1][j+1]=Math.max(dp[i+1][j+1],dp[i][j]+1);
                    res[i+1][j+1]=2;
                }
            }
        }
//        System.out.println(dp[sn][tn]);
        StringBuilder sb = new StringBuilder();
        int dir = res[sn][tn];
        while(sn>0 && tn >0){
            if(dir==0){
                sn--;
            }else if(dir==1){
                tn--;
            }else{
                sn--;tn--;
                sb.insert(0,s.charAt(sn));
           }
            dir = res[sn][tn];
        }
        System.out.println(sb.toString());
    }

}
