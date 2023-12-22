import java.util.* ;

class Main {
    static int dp[] = new int[100001] ; 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int n = sc.nextInt() ; 
        int arr[] = new int[n+1] ; 
        for(int i=1 ; i<=n ; i++){
            arr[i] = sc.nextInt() ; 
        }
        for(int i=0 ; i<=n ; i++){
            dp[i] = -1 ; 
        }
        System.out.println(path(arr, n)); 
    }

    static int path(int arr[],int n){
        if(n<=1){
            return dp[n] = 0  ; 
        }
        if(n==2){
            return dp[n]=Math.abs(arr[n]-arr[n-1]) ;
        }
        if(dp[n]!=-1){
            return dp[n] ; 
        }
        else {
            return dp[n]= Math.min(Math.abs(arr[n]-arr[n-1])+path(arr, n-1),Math.abs(arr[n-2]-arr[n])+path(arr, n-2)) ; 
        }
       
    
    }

    
}
