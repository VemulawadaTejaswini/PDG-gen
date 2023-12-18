import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while ( true ) {
            int n = Integer.parseInt(br.readLine());

            if ( n < 3 || 1000 < n ) {
                break;
            }

            int sum = 0;
            int max = 0;
            int min = 1000;

            for ( int i = 0; i < n; i++) {
                int point = Integer.parseInt(br.readLine());

                if( max < point ) {
                    max = point;
                }
                if( point < min ) {
                    min = point;
                }
                sum += point;
            }

            sum -= max;
            sum -= min;

            int ave = sum / (n-2);

            System.out.println(ave);
        }
    }
}

