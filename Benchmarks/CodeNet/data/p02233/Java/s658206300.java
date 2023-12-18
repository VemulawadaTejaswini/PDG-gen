import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        System.out.println(fib(n));
    }
    /*                                                                             
    public static int fib(int n){                                                  
        //int res;                                                                 
        if(n == 0)return 1;                                                        
        if(n == 1)return 1;                                                        
        return fib(n-1) + fib(n-2);                                                
        //return fib(n);                                                           
    }                                                                              
    */
    //dynamic programing ver                                                       
    public static int fib(int n){
        int[] memo = new int[n+1];//memo is based on memo[i] for fib[i]            
        int res;
        if(n == 0) {
            memo[0] = 1;
            return 1;
        }
        if(n == 1){
            memo[1] = 1;
            return 1;
        }
        if(memo[n-1] != 0 && memo[n-2] != 0){
        res = memo[n-1] + memo[n-2];
        }else if(memo[n-1] != 0){
            res = memo[n-1] + fib(n-2);
        }else{
            res = fib(n-1) + fib(n-2);
        }
        return res;
    }
}