import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * http://judge.u-aizu.ac.jp/onlinejudge/description.jsp?id=ITP1_4_A
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
                
                int a = Integer.valueOf(inputs[0]);
                int b = Integer.valueOf(inputs[1]);
                // int c = Integer.valueOf(inputs[2]);
                
                // Zero Divide
                if (b == 0)
                    System.exit(-1);
                
                System.out.print((a - a % b) / b);
                System.out.print(SPACE);
                System.out.print(a % b);
                System.out.print(SPACE);
                double divide = (double)a / (double)b;
                String divideStr = String.format("%.5f", divide);
                System.out.print(divideStr);
                
            }
            stdReader.close();
        } catch (Exception e) {
            System.exit(-1);
        }
    }
}