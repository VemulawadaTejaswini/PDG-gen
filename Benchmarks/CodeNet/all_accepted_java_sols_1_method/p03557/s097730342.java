import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        long[][] nums=new long[3][n];
        long[] ans=new long[n+1];
        for(int i=0;i<3;i++){
            for(int j=0;j<n;j++){
                nums[i][j]=sc.nextInt();
            }
            Arrays.sort(nums[i]);
        }
        int index=n;
        for(int i=n-1;i>=0;i--){
            for(int j=index;j>=0;j--){
                if(j==0||nums[1][i]>=nums[2][j-1]){
                    ans[i]=n-j;
                    index=j;
                    break;
                }
            }
        }
        for(int i=n-2;i>=0;i--){
            ans[i]+=ans[i+1];
        }
        index=n;
        long finalans=0;
        for(int i=n-1;i>=0;i--){
            for(int j=index;j>=0;j--){
                if(j==0||nums[0][i]>=nums[1][j-1]){
                    finalans+=ans[j];
                    index=j;
                    break;
                }
            }
        }
        System.out.println(finalans);
    }
}