import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Reopard on 2014/05/06.
 */
public class Main {
    public static void main(String args[]) {
        long a, b, gcd, lcm;
        String line;
        String number[];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try{
            while((line = reader.readLine()) != null){
                number = line.split(" ");
                a = Long.parseLong(number[0]);
                b = Long.parseLong(number[1]);
                if(a > b) gcd = GCD(a, b);
                else gcd = GCD(b, a);
                lcm = a*b/gcd;
                System.out.println(gcd + " " + lcm);
            }
        }catch(IOException e){
            System.exit(0);
        }
    }

    static long GCD(long a, long b){
        long tmp;
        if(a%b != 0){
            tmp = GCD(b, a%b);
        }else return b;
        return tmp;
    }
}