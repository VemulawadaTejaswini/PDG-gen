import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.util.regex.Pattern;

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
            String pile = null;
            long lineNum = 0;
            long resultShowLine = 0;
            
            // ??????????????????
            Pattern p = Pattern.compile("^[0-9]*$");
            
            while ((inputStr = lineNumReader.readLine()) != null) {
                
                // ???????????¶.
                if ("-".equals(inputStr)) {
                    // do nothing.
                    break;
                }
                
                // ??±??°?????????????????????.
                if (p.matcher(inputStr).find()) {
                    if (lineNumReader.getLineNumber() == lineNum + 1) {
                        // ?????£??????????????°???????????????????????¨?????????????????°????¨????.
                        resultShowLine = resultShowLine
                                + Integer.parseInt(inputStr) + 2;
                        continue;
                    } else {
                        // ?????£?????????????????????
                        int h = Integer.parseInt(inputStr);
                        pile = shuffle(pile, h);
                    }
                } else {
                    pile = inputStr;
                    lineNum = lineNumReader.getLineNumber();
                }
                
                if (lineNumReader.getLineNumber() == resultShowLine) {
                    // ??¢???????????????
                    System.out.println(pile);
                }
            }
            
            lineNumReader.close();
        } catch (Exception e) {
            System.exit(-1);
        }
        
    }
    
    public static String shuffle(String original, int h) {
        StringBuilder shuffledStr = new StringBuilder(original);
        String temp = shuffledStr.substring(0, h);
        shuffledStr.delete(0, h);
        shuffledStr.append(temp);
        return shuffledStr.toString();
        
    }
}