import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=sc.nextInt();
        int[] nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        long[][][] ans=new long[n][n+1][2501];//何個目まで見たか、何個使ったか、和
        ans[0][0][0]=ans[0][1][nums[0]]=1;
        for(int i=1;i<n;i++){
            for(int j=0;j<n+1;j++){
                for(int k=0;k<2501;k++){
                    ans[i][j][k]=ans[i-1][j][k]+(j>0&&k>=nums[i]?ans[i-1][j-1][k-nums[i]]:0);
                }
            }
        }
        long finalans=0;
        for(int i=1;i<n+1;i++){
            finalans+=ans[n-1][i][a*i];
        }
        System.out.println(finalans);
    }
    
    
}