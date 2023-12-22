import java.util.Scanner;

class Main{
    static Scanner scan=new Scanner(System.in);
    public static void main(String args[]){
        int n;
        Integer a[][]=new Integer[2][200];

        n=scan.nextInt();
        for(int i=0;i<2;i++){
            for(int j=0;j<n;j++){
                a[i][j]=scan.nextInt();
            }
        }
        int dp[][]=new int[3][200];
        dp[0][0]=a[0][0];
        for(int i=1;i<n;i++){
            dp[0][i]=dp[0][i-1]+a[0][i];
        }
        dp[1][0]=dp[0][0]+a[1][0];
        
        for(int i=1;i<2;i++){
            for(int j=1;j<n;j++){
                if(dp[i-1][j]>dp[i][j-1]){
                    dp[i][j]=dp[i-1][j]+a[i][j];
                }else{
                    dp[i][j]=dp[i][j-1]+a[i][j];
                }
            }
        }
        System.out.println(dp[1][n-1]);

    }
}