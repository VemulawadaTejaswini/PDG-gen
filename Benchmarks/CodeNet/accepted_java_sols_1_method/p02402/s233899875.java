import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.util.Arrays;

/**
 * http://judge.u-aizu.ac.jp/onlinejudge/description.jsp?id=ITP1_4_D
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
                if (stdReader.getLineNumber() == 1) {
                    String[] inputs = sStr.split(" ");
                    n = Integer.valueOf(inputs[0]);
                }
                
                if (stdReader.getLineNumber() == 2) {
                    String[] inputs = sStr.split(" ");
                    int i = 0;
                    an = new int[n];
                    for (String input : inputs) {
                        an[i] = Integer.parseInt(input);
                        i++;
                    }
                }
            }
            // sort by ascending order.
            Arrays.sort(an);
            System.out.print(an[0]);
            System.out.print(SPACE);
            System.out.print(an[n - 1]);
            System.out.print(SPACE);
            long sum = 0;
            for (int a : an) {
                sum += a;
            }
            System.out.println(sum);
            
            stdReader.close();
        } catch (Exception e) {
            System.exit(-1);
        }
    }
}