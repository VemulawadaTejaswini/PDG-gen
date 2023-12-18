import java.io.InputStreamReader;
import java.io.LineNumberReader;

/**
 * http://judge.u-aizu.ac.jp/onlinejudge/description.jsp?id=ITP1_9_C
 * 
 * @author eitatsuro
 * 
 */
public class Main {
    
    public static final int WIN_POINTS=3;
    public static final int EVEN_POINTS=1;
    
    public static void main(String[] args) {
        try {
            LineNumberReader lineNumReader = new LineNumberReader(
                    new InputStreamReader(System.in));
            
            String inputStr = null;
            long turnNum = 0;
            String taro = null;
            String hanako = null;
            long taroPoint=0;
            long hanakoPoint=0;
            
            while ((inputStr = lineNumReader.readLine()) != null) {
                
                // ????????????????????°?????????.
                if (lineNumReader.getLineNumber() == 1) {
                    turnNum = Integer.parseInt(inputStr);
                }
                
                if (lineNumReader.getLineNumber() > 1) {
                    String[] line = inputStr.split(" ");
                    taro = line[0];
                    hanako = line[1];
                    
                    // ??????
                    if (taro.compareTo(hanako) < 0) {
                        hanakoPoint += WIN_POINTS;
                    } else if (taro.compareTo(hanako) == 0) {
                        taroPoint += EVEN_POINTS;
                        hanakoPoint += EVEN_POINTS;
                    } else {
                        taroPoint += WIN_POINTS;
                    }
                }


                
                if (lineNumReader.getLineNumber() == turnNum+1) {
                    System.out.print(taroPoint);
                    System.out.print(" ");
                    System.out.println(hanakoPoint);
                    break;
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