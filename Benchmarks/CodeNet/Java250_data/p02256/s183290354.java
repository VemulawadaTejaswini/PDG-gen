import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] lines = br.readLine().split(" ");
        long a=Long.parseLong(lines[0]);
        long b=Long.parseLong(lines[1]);
        System.out.println(gcd(a,b));
    }
    static long gcd(long x,long y){
       if(x<y){
           long temp=x;
           x=y;
           y=temp;
       }
       if(y >0){
           return gcd(y,x%y);
       }else{
           return x;
       }
    }
}
      