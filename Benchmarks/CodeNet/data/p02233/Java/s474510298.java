import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    /*static long fib_recur(int n){
        //TLE
            if (n==0){
                return 1;
            }else if(n==1){
                return 1;
            }else{
                return fib(n-1)+fib(n-2);
            }
        }
	*/
    static long fib(int n){
        if (n==0) return 1;
        else if (n==1) return 1;
        
        long val = 2;           //fib(n)
        long val_pre = 1;       //fib(n-1)
        long val_prepre = 1;    //fib(n-2) 
        for (int i = 2; i < n; i++){
            val_prepre = val_pre;
			val_pre = val;
            val = val_pre + val_prepre;
        }
        return val;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        System.out.println(fib(n));
    }
}