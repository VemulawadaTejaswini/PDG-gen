import java.io.InputStreamReader;
import java.io.LineNumberReader;

/**
 * http://judge.u-aizu.ac.jp/onlinejudge/description.jsp?id=ITP1_9_C
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
            double x1 = 0;
            double x2 = 0;
            double y1 = 0;
            double y2 = 0;
            
            while ((inputStr = lineNumReader.readLine()) != null) {
                
                // ??????????????????????????????.
                if (lineNumReader.getLineNumber() == 1) {
                    String[] points = inputStr.split(" ");
                    x1 = Double.parseDouble(points[0]);
                    y1 = Double.parseDouble(points[1]);
                    x2 = Double.parseDouble(points[2]);
                    y2 = Double.parseDouble(points[3]);
                    
                    // ?????¢????¨????.
                    double dist = Math.sqrt(Math.pow(x1-x2, 2) + Math.pow(y1-y2, 2));
                    
                    // ????????????.
                    System.out.println(String.format("%.8f", dist));
                }
                
                if (lineNumReader.getLineNumber() > 1) {
                    break;
                }
            }
            
            lineNumReader.close();
        } catch (Exception e) {
            e.printStackTrace();
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