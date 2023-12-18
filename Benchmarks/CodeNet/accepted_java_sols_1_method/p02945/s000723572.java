
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author kaixi_000
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String str=br.readLine();
        String[] t=str.split("\\ ");
        int a=Integer.parseInt(t[0]); int b=Integer.parseInt(t[1]);
        System.out.println(Math.max(a*b,Math.max(a-b,a+b)));
    }
    
}
