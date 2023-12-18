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
        InputStreamReader is = new InputStreamReader(System.in);       //?????????
        BufferedReader br = new BufferedReader(is);
        String str = br.readLine();
        int x = Integer.parseInt(str);
        if(1 <= x && 100 >= x){
            System.out.println(x * x * x);
        }else{
            System.out.println("??°????????????????????????????¶???????????????????");
        }
        
    }
    
}