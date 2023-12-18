import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;

/**
 * Created by Reopard on 2014/05/06.
 */
public class Main {
    public static void main(String args[]){
        double x, y;
        double a, b, c, d, e, f;
        String line;
        String tmp[];
        BufferedReader reader  = new BufferedReader(new InputStreamReader(System.in));
        try{
            while((line = reader.readLine()) != null){
                tmp = line.split(" ");
                a = Double.parseDouble(tmp[0]);
                b = Double.parseDouble(tmp[1]);
                c = Double.parseDouble(tmp[2]);
                d = Double.parseDouble(tmp[3]);
                e = Double.parseDouble(tmp[4]);
                f = Double.parseDouble(tmp[5]);
                x = (c*e-b*f)/(a*e-b*d);
                y = (-c*d+a*f)/(a*e-b*d);
                BigDecimal bi_x = new BigDecimal(x);
                BigDecimal bi_y = new BigDecimal(y);
                x = bi_x.setScale(3, BigDecimal.ROUND_HALF_UP).doubleValue();
                y = bi_y.setScale(3, BigDecimal.ROUND_HALF_UP).doubleValue();
                System.out.println(x + " " + y);
            }
        }catch(IOException error){
            System.exit(0);
        }
    }
}