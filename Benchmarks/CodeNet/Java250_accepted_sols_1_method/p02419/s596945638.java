import java.io.InputStreamReader;
import java.io.LineNumberReader;

/**
 * http://judge.u-aizu.ac.jp/onlinejudge/description.jsp?id=ITP1_9_A
 * 
 * @author eitatsuro
 * 
 */
public class Main {
    
    public static void main(String[] args) {
        try {
            LineNumberReader lineNumReader = new LineNumberReader(
                    new InputStreamReader(System.in));
            
            String inputStr = null;
            String w = null;
            long num = 0;
            
            while ((inputStr = lineNumReader.readLine()) != null) {
                
                if (lineNumReader.getLineNumber() == 1) {
                    w = inputStr.toLowerCase();
                }
                
                // ???????????¶.
                if ("END_OF_TEXT".equals(inputStr)) {
                    // do nothing.
                    break;
                }
                
                // 2????????\???????????±????????????
                if (lineNumReader.getLineNumber() > 1) {
                    // ??§???????°????????????\??????????????§????°????????????±???.
                    inputStr = inputStr.toLowerCase();
                    
                    // ???????????????
                    String[] words = inputStr.split(" ");
                    for (String word : words) {
                        if (word.equalsIgnoreCase(w)) {
                            num++;
                        }
                    }
                }
            }
            
            // ??¢???????????????
            System.out.println(num);
            lineNumReader.close();
        } catch (Exception e) {
            System.exit(-1);
        }
        
    }
}