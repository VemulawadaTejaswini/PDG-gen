import java.util.*;

public class Main {

    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[][] = new int[n][3];
        for(int i=0;i<n;i++){
            arr[i][0] = in.nextInt();
            arr[i][1] = in.nextInt();
            arr[i][2] = in.nextInt();
        }
        int dp1[] = new int[n];
        int dp2[] = new int[n];
        int dp3[] = new int[n];
        dp1[0] = arr[0][0];
        dp2[0] = arr[0][1];
        dp3[0] = arr[0][2];
        for(int i=1;i<n;i++){
            dp1[i] = Math.max(dp2[i-1],dp3[i-1]) + arr[i][0];
            dp2[i] = Math.max(dp1[i-1],dp3[i-1]) + arr[i][1];
            dp3[i] = Math.max(dp2[i-1],dp1[i-1]) + arr[i][2];
        }
        System.out.println(Math.max(Math.max(dp1[n-1],dp2[n-1]),dp3[n-1]));

    }

}