import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        long n=Long.parseLong(reader.readLine());
        long count=0;
        for (long i = 1; i <= n; i++) {
            for (long j = 1; j <=n ; j++) {
                for (long k = 1; k <=n ; k++) {
                    count+=gcd3(i,j,k);
                }
            }
        }
        System.out.println(count);
    }
    static long gcd(long a,long b){
        if (b==0)
            return a;
        else
            return gcd(b,a%b);
    }
    static long gcd3(long a,long b,long c){
        return gcd(gcd(a,b),c);
    }
}