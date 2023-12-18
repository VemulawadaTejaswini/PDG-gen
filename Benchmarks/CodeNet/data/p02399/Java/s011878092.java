import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args)throws Exception {
    	InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

       String[] input = br.readLine().split(" ");
       int a = Integer.parseInt(input[0]);
       int b = Integer.parseInt(input[1]);
       int d = a / b;
       int r = a % b;
       double f = (double)a / b;
       System.out.printf("%d %d %.5f" ,d , r , f);
    }
}