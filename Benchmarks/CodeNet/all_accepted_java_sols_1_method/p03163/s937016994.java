import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int w = in.nextInt();

        int[] weight = new int[n+1];
        int[] prize = new int[n+1];

        for(int i=0;i<n;i++){

                int x = in.nextInt();
                int y = in.nextInt();
                weight[i] = x;
                prize[i] =y;

        }




        long[][] dp = new long[n+1][w+1];


        for(int i=0;i<=n;i++){

            for(int j=0;j<=w;j++){

               if(i==0 || j==0) dp[i][j] = 0;

               else if (j<weight[i-1]) dp[i][j] = dp[i-1][j];

               else {

                   dp[i][j] = Math.max(dp[i-1][j] , prize[i-1] + dp[i-1][j-weight[i-1]]);


               }
            }


        }


//        for(int i=0;i<=n;i++){
//
//            for(int j=0;j<=w;j++){
//
//                System.out.print(dp[i][j]+" ");
//            }
//
//            System.out.println();
//
//        }
//

        System.out.println(dp[n][w]);



    }

}
