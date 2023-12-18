import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args)throws Exception {
    	InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

       String input = br.readLine();
       double r = Double.parseDouble(input);
       double men = (double) r * r * Math.PI;
       double nagasa = (double) r * 2 * Math.PI;
       System.out.printf("%.6f %.6f" ,men,nagasa);
    }
}