import java.util.*;
import java.io.*;
class Main {
    
    public static void solve(long[] arr){
        PriorityQueue<Long> p = new PriorityQueue<>();
        for(long i : arr){
            p.add(i);
        }
        int mod = 1000000009;
        long sum= 0;

        while(p.size() > 1){
           long first = p.poll();
           long second = p.poll();

            sum += first+second;
            
            p.add(first+second);
        }

        System.out.println(sum);

    }

    public static long frog(long[] arr){
        long[] dp = new long[arr.length];
        
        // dp[0] = arr[0];
        for(int i = 1; i < arr.length; i++){
            long option1 = Long.MAX_VALUE;
            long option2 = Long.MAX_VALUE;
            option1 = dp[i-1] + Math.abs(arr[i] - arr[i-1]);
            if(i-2 >= 0){
                option2 = dp[i-2] + Math.abs(arr[i] - arr[i-2]);
            }

            dp[i] = Math.min(option1,option2);
        
        }

        return (dp[dp.length-1]);
    }
    
    public static void main(String[] args) throws Exception{
        StringTokenizer str;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());
        long[] arr = new long[n];
        int i = 0;
           str = new StringTokenizer(br.readLine().trim()," ");   
            while(str.hasMoreTokens()){
                arr[i]=Long.parseLong(str.nextToken());
                i++;
            }
       
         System.out.println(frog(arr));
     
    }
}