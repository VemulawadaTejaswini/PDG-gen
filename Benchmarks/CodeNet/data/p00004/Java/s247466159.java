
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
 
public class Main {
 
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = null;
         
        try {
            while((line = br.readLine()) != null) {
                line = line.trim();
                String[] values = line.split("\\s");
                if(values.length != 6) System.exit(-1);
                double[] value = new double[6];
                int i = 0;
                for(String s : values) {
                    value[i] = Integer.parseInt(s);
                    if(value[i] < -1000 || value[i] > 1000) System.exit(-1);
                    i++;
                }
                 
                double a = value[0];
                double b = value[1];
                double c = value[2];
                double d = value[3];
                double e = value[4];
                double f = value[5];
                 
                double x = (c*e - f*b) / (a*e - b*d);
                double y = (c*d - f*a) / (b*d - a*e);
                 
                BigDecimal bdX = new BigDecimal(x);
                BigDecimal bdY = new BigDecimal(y);
                bdX = bdX.setScale(3, BigDecimal.ROUND_HALF_UP);
                bdY = bdY.setScale(3, BigDecimal.ROUND_HALF_UP);
 
                System.out.println(bdX + " " + bdY);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
         
    }
 
}