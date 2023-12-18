import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{
    public static final int M = 1000000007;

    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] t = br.readLine().split(" ");
        int m = Integer.parseInt(t[0]);
        int n = Integer.parseInt(t[1]);
        System.out.println(power(m, n));
    }

    public static long power(int x, int n){
        long res = 1;
        if(n > 0){
            res = power(x, n / 2);
            if(n % 2 == 0) res = (res * res) % M;
            else res = (((res * res) % M) * x) % M;
        }
        return res;
    }

}