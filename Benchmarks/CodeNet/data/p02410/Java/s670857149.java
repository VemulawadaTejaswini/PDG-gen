import java.io.InputStreamReader;
import java.io.LineNumberReader;

/**
 * http://judge.u-aizu.ac.jp/onlinejudge/description.jsp?id=ITP1_6_D
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
            int m = 0;
            int[][] a = null;
            int[] b = null;
            while ((sStr = stdReader.readLine()) != null) {
                
                // ????????????????????????
                if (stdReader.getLineNumber() == 1) {
                    String[] inputs = sStr.split(" ");
                    n = Integer.valueOf(inputs[0]);
                    m = Integer.valueOf(inputs[1]);
                    // ??????????´???¨??????
                    a = new int[n][];
                    b = new int[m];
                } else if (stdReader.getLineNumber() <= 1 + n) {
                    // 2????????\??????????????????
                    // ??????????????°(0,1,2,...)
                    int i = stdReader.getLineNumber() - 2;
                    String[] inputs = sStr.split(" ");
                    int j = 0;
                    a[i] = new int[m];
                    for (String input : inputs) {
                        a[i][j] = Integer.parseInt(input);
                        j++;
                    }
                } else if (stdReader.getLineNumber() <= 1 + n + m) {
                    String[] inputsVector = sStr.split(SPACE);
                    int k = stdReader.getLineNumber() - (2+n);
                    b[k] = Integer.parseInt(inputsVector[0]);

                    if (stdReader.getLineNumber() == 1+n+m) break;
                }
            }
            
            int c[] = new int[n];

            // ?????? x ?????????????????????
            for (int i =0; i<n; i++) {
                int temp = 0;
                for (int j = 0; j<m; j++){
                    temp += a[i][j] * b[j];
                }
                c[i] = temp;
            }
            
            // ??¢???????????????
            for (int ci: c){
                System.out.println(ci);
            }

            stdReader.close();
        } catch (Exception e) {
            System.exit(-1);
        }
        
    }
}