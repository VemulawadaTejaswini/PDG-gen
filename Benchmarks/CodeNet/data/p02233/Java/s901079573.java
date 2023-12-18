import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        System.out.println(fib(n));
    }

    public static int fib(int n){
        //int res;                                                                 
        if(n == 0)return 1;
        if(n == 1)return 1;
        return fib(n-1) + fib(n-2);
        //return fib(n);                                                           
    }
}