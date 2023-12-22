
import java.io.*;
import java.util.*;
class Main {
    static int check;
    public static void main (String[] args) {
        //System.out.println("GfG!");
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int W = sc.nextInt();
        int val[]=new int[n];
        int wt[]=new int[n];
        int valSum=0;
        for(int i=0;i<n;i++){
            wt[i]=sc.nextInt();
            val[i]=sc.nextInt();
            valSum+=val[i];
        }
        long K[][]=new long[n+1][valSum+1];
        for(int i=0;i<=n;i++){
            for(int j=0;j<=valSum;j++)
                K[i][j]=0;
        }
        // Build table K[][] in bottom up manner
        int count=0;

        for (int i = 1; i <= n; i++)
        {
            int value = val[i-1];
            int weight=wt[i-1];
            //System.out.println(value+" "+weight);
            for (int j = 0; j <= valSum; j++)
            {       if(K[i-1][j]>0){
                int kval = value +j;
                long kwt = K[i-1][j]+weight;
                if(K[i][kval]==0){
                    K[i][kval]=kwt;
                }
                else{
                    K[i][kval]=Math.min(K[i][kval],kwt);
                }

            }
                    if(K[i-1][j]>0){
                        if(K[i][j]==0)
                            K[i][j]=K[i-1][j];
                        else{
                            K[i][j]=Math.min(K[i][j],K[i-1][j]);
                        }
                    }
                    if(j==value){
                        if(K[i-1][j]<=0)
                            K[i][j]=weight;
                        else{
                            K[i][j]=Math.min(weight,K[i-1][j]);
                        }
                    }

            }
        }
        // finding ans by taking max value of the array

        int ans=0;

            for(int j=1;j<=valSum;j++){

                if(K[n][j]<=W && K[n][j]!=0){
                    if(j>ans)
                        ans=j;
                }
            }



        System.out.println(ans);
        /*for(int i=1;i<=valSum;i++){
            System.out.println(i+":"+K[n][i]);
        }
        /*
        3 30
        4 50
        5 60*/
    }}