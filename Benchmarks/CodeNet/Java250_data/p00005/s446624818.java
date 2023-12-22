import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true){
            String tmp = br.readLine();

            if(tmp == null){
                break;
            }

            String[] tmpArray = tmp.split(" ");
            int a = Integer.parseInt(tmpArray[0]);
            int b = Integer.parseInt(tmpArray[1]);

            int GCD = gcd(a, b);

            int LCM = lcm(a, b, GCD);
            System.out.println(GCD + " "+ LCM);
        }
    }

    static int gcd(int a, int b){
    	int tmp;

    	while (a % b != 0)
    	{
    		tmp = b;
    		b = a % b;
    		a = tmp;
    	}
    	return b;
    }

    static int lcm(int a, int b, int gcd){
    	return a*(b/gcd);
    }

    static int lcm(int a, int b){
    	int g = gcd(a, b);

    	return lcm(a,b,g);
    }

}