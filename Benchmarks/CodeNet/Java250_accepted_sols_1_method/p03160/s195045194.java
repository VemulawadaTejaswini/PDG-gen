import java.util.Scanner;

 class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        int[] dp = new int[n];
        for(int i=0;i<n;++i){
            arr[i]=input.nextInt();
        }
        if(n==0 || n==1)
            System.out.println("0");
        else {
            dp[1]=Math.abs(arr[1]-arr[0]);
            for (int i = 2; i < n; ++i) {
                int val1 = dp[i-1]+Math.abs(arr[i]-arr[i-1]);
                int val2 = dp[i-2]+Math.abs(arr[i]-arr[i-2]);
                dp[i]=Math.min(val1,val2);
            }
        }
        System.out.println(dp[n-1]);

    }
}
