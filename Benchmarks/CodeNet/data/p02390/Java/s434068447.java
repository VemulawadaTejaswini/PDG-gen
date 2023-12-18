import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int n = Integer.parseInt(str);
        if( 0 <= n && n <= 86400 ){
            int a = n / 3600;
            int b = (n % 3600) / 60;
            int c = (n % 3600) % 60;
            System.out.println(a + ":" + b + ":" + c);
        }
    }
}