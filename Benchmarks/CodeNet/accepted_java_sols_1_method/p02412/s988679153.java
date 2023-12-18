import java.io.InputStreamReader;
import java.io.LineNumberReader;

/**
 * http://judge.u-aizu.ac.jp/onlinejudge/description.jsp?id=ITP1_7_B
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
            int x = 0;
            int count = 0;

            while ((sStr = stdReader.readLine()) != null) {
                
                // ??\???
                String[] inputs = sStr.split(SPACE);
                n = Integer.valueOf(inputs[0]);
                x = Integer.valueOf(inputs[1]);

                // ??????????????????
                if ( n ==0 && x ==0) {
                    break;
                }

                // 1 .. n?????§?????°?????????????????????3????????°???????????§????¨????x??¨?????????????????????.
                for (int i=1; i<=n; i++){
                    for(int j=i+1; j<=n; j++) {
                        for(int k=j+1; k<=n; k++){
                            if (i+j+k == x) {
                                count++;
                            }
                        }
                    }
                }
                
                // ????????????
                System.out.println(count);
                // ?????????
                count = 0;
            }

            stdReader.close();
        } catch (Exception e) {
            System.exit(-1);
        }
        
    }
}