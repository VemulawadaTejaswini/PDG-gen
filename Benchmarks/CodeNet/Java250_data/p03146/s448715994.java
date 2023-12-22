
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.util.HashSet;
//import org.apache.commons.lang3.StringUtils;
 
 
/**
 *
 * @author aj
 */
public class Main {
    
    public static void main(String[] args){
        try {
            //Scanner sc = new Scanner(System.in);
            BufferedInputStream bf = new BufferedInputStream(System.in);
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(bf, StandardCharsets.UTF_8));
            OutputStream out = new BufferedOutputStream ( System.out );
            
            int s = Integer.parseInt(in.readLine());
            int lim = 1000000,i= 2 , a = s;
            HashSet<Integer> set = new HashSet();
            set.add(s);
            while(i<lim){
                if (a%2==0) a = a / 2 ;
                else a = 3 * a + 1;
                if (!set.add(a)) break;
                i++;
            }
            out.write((i+"\n").getBytes());
            out.flush();
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
}