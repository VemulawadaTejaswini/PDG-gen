import java.util.Scanner;



public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int[][]  arr = new  int[n][3];

        for(int i=0;i<n;i++){
            for(int j=0;j<=2;j++){
                arr[i][j] = in.nextInt();
            }
        }

        int[][] dp = new int[n][3];

        dp[0][0] = arr[0][0];
        dp[0][1] = arr[0][1];
        dp[0][2] = arr[0][2];


        for(int i=1;i<n;i++){

                dp[i][0] = arr[i][0] + Math.max(dp[i-1][1],dp[i-1][2]);
                dp[i][1] = arr[i][1] + Math.max(dp[i-1][0],dp[i-1][2]);
                dp[i][2] = arr[i][2] + Math.max(dp[i-1][1],dp[i-1][0]);

        }

        int x = Math.max(Math.max(dp[n-1][0],dp[n-1][1]),dp[n-1][2]);

//        for(int i=0;i<n;i++){
//            for(int j=0;j<=2;j++){
//                System.out.print(dp[i][j]+" ");
//            }
//            System.out.println();
//        }



        System.out.println(x);





    }

}
