import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * http://judge.u-aizu.ac.jp/onlinejudge/description.jsp?id=ITP1_4_B
 * 
 * @author chrone
 * 
 */
public class Main {
    
    private final static String SPACE = " ";
    
    public static void main(String[] args) {
        try {
            BufferedReader stdReader = new BufferedReader(
                    new InputStreamReader(System.in));
            
            String sStr;
            while ((sStr = stdReader.readLine()) != null) {
                String[] inputs = sStr.split(" ");
                
                double r = Double.valueOf(inputs[0]);

                String area = String.format("%.5f", r*r*Math.PI);
                System.out.println(area);
                System.out.print(SPACE);
                String length = String.format("%.5f", 2*Math.PI*r);
                System.out.print( length );

            }
            stdReader.close();
        } catch (Exception e) {
            System.exit(-1);
        }
    }
}