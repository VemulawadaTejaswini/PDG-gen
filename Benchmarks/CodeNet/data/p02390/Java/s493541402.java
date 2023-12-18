import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author k15115kk
 */
public class Main {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(is);
        String b = br.readLine();
        int S = Integer.parseInt(b);
        if(S >= 0 && S <= 86400){
        int h = S / 3600;
        S = S - h * 3600;
        int m = S / 60;
        int s = S - m * 60;
        System.out.println(h+":"+m+":"+s);
        }
    }

}