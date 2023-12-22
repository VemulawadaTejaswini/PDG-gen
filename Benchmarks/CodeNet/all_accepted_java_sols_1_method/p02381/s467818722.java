import java.io.InputStreamReader;
import java.io.LineNumberReader;

/**
 * http://judge.u-aizu.ac.jp/onlinejudge/description.jsp?id=ITP1_10_C
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
            double  scores[] = null;
            int studentsNum = 0;
            
            while ((inputStr = lineNumReader.readLine()) != null) {
                
                // ???????????°
                if (lineNumReader.getLineNumber()%2 == 1) {
                    studentsNum = Integer.parseInt(inputStr);
                }
                
                // ???????????¶.
                if (studentsNum == 0) {
                    break;
                }
                
                // ????????¢
                if (lineNumReader.getLineNumber() % 2 == 0) {
                    String[] points = inputStr.split(" ");
                    scores = new double[studentsNum];
                    int i = 0;
                    for (String point : points) {
                        scores[i] = Long.parseLong(point);
                        i++;
                    }
                    
                    // ?????????????¨????
                    double sum = 0;
                    for (double score : scores) {
                        sum += score;
                    }
                    double mean = sum / studentsNum;
                    
                    // ?????£ sig2
                    double sig2 = 0;
                    for (double score : scores) {
                        sig2 += Math.pow(score - mean, 2);
                    }
                    
                    // ?¨?????????? sigma
                    double sigma = Math.sqrt(sig2 / studentsNum);
                    
                    // ????????????.
                    System.out.println(String.format("%.8f", sigma));
                }
            }
            
            lineNumReader.close();
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(-1);
        }
    }
}