import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main {
    private static int MOD = 1000000007;


    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        long k = Long.parseLong(br.readLine());

        int x = 0;
        long now = 100;
        while(true){
            x++;
            long rishi = now / 100;
            now += rishi;
            if(k <= now){
                break;
            }
        }

        System.out.println(x);
    }


}
