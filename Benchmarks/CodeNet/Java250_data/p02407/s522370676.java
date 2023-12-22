import java.io.InputStreamReader;
import java.io.LineNumberReader;

/**
 * http://judge.u-aizu.ac.jp/onlinejudge/description.jsp?id=ITP1_6_A
 * 
 * @author eitatsuro
 * 
 */
public class Main {
    private final static String SPACE = " ";
    public static void main(String[] args) {
        try {
            LineNumberReader stdReader = new LineNumberReader(
                    new InputStreamReader(System.in));
            
            String sStr;
            int n = 0;
            int[] an = null;
            while ((sStr = stdReader.readLine()) != null) {
                
                // ????????????????????????
                if (stdReader.getLineNumber() == 1) {
                    String[] inputs = sStr.split(" ");
                    n = Integer.valueOf(inputs[0]);
                }
                
                // 2?????????????????????
                if (stdReader.getLineNumber() == 2) {
                    String[] inputs = sStr.split(" ");
                    int i = 0;
                    an = new int[n];
                    for (String input : inputs) {
                        an[i] = Integer.parseInt(input);
                        i++;
                    }
                    break;
                }
            }

            for (int i=n-1; i>=0; i--) {
                System.out.print(an[i]);
                if (i != 0) System.out.print(SPACE);
            }
            System.out.println();

            stdReader.close();
        } catch (Exception e) {
            System.exit(-1);
        }
        
    }
}