import java.io.InputStreamReader;
import java.io.LineNumberReader;

/**
 * http://judge.u-aizu.ac.jp/onlinejudge/description.jsp?id=ITP1_
 * 
 * @author eitatsuro
 * 
 */
public class Main {
    private final static String SPACE = " ";
    
    public static void main(String[] args) {
        try {
            LineNumberReader lineNumReader = new LineNumberReader(
                    new InputStreamReader(System.in));
            
            String inputStr = null;
            String outputStr = null;
            int n = 0;
            int m = 0;
            int l = 0;
            long[][] a = null;
            long[][] b = null;
            while ((inputStr = lineNumReader.readLine()) != null) {
                
                // ????????????????????????
                if (lineNumReader.getLineNumber() == 1) {

                    StringBuilder sb = new StringBuilder();
                    char temp;
                    for (int i=0; i<inputStr.length(); i++){
                        temp = inputStr.charAt(i);
                        // ??§?????????????°????????????????
                        if (Character.isUpperCase(temp)) {
                            sb.append(Character.toLowerCase(temp));
                        // ?°???????????????§???????????????
                        } else if (Character.isLowerCase(temp)) {
                            sb.append(Character.toUpperCase(temp));
                        // ????????\????????????????????????
                        } else {
                            sb.append(temp);
                        }
                    }
                    outputStr = sb.toString();
                }

                if (lineNumReader.getLineNumber() == 1 ) {
                        break;
                }
            }

            // ??¢???????????????
            System.out.println(outputStr);

            lineNumReader.close();
        } catch (Exception e) {
            System.exit(-1);
        }
        
    }
}