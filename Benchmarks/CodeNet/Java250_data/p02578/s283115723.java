 
import java.util.Scanner;
 
public class Main{//2 1 5 4 3
    
    public static void solve(int[] arr){
     
        long ans = 0;
        int prev = Integer.MIN_VALUE;
        for(int i= 0; i < arr.length; i++){
            if(arr[i] < prev){
                ans += prev - arr[i];
            }
            
           prev = Math.max(prev,arr[i]);
        }
        
        System.out.println(ans);
    }
 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        long ans=0;
        int[] arr = new int[N];
        for(int i=0;i<N;i++){
            arr[i]=sc.nextInt();
        }
        
        
        solve(arr);
        
        
    }
}